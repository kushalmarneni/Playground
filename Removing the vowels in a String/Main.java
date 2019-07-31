import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=new String();
    str=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder sb1=new StringBuilder();
    int j=0;
    int len=str.length();
    for(int i=0;i<len;i++)
    {
      char ch= str.charAt(i);
      if(ch!='u' && ch!='a') 
      {
        System.out.print(ch);
      }
    }
  }
}