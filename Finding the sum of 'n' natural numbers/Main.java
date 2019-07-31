import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=sum(n);
     System.out.println(res);
    }
  public static int sum(int n)
  {
    if(n==0)
      return 0;
    else
      return n+sum(n-1);
  }
}