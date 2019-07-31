import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    int frst=num%10;
    int mid=(num/10)%10;
    int last=num/100;
    int rev=(frst*100)+(mid*10)+last;
    System.out.println(rev);
  }
}