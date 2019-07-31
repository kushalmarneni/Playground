import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=Math.abs(n);
    int temp=m;
    int count=0;
    while(m>0)
    {
      count++;
      m=m/10;
    }
    char[] str=new char[count];
    count=count-1;
    while(temp>0)
    {
      str[count]=(char)((temp%10)+'0');
      temp=temp/10;
      count--;
    }
    System.out.println(n);
  }
}