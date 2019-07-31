import java.util.Scanner;
class Main
{
  static int sq(int n)
  {
    return n*n;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sq(n));
	} 
}