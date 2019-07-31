import java.util.Scanner;
class Main{
  public static int facto(int n)
   {
     int fact=1;
      for(int i=n;i>0;i--)
      {
        fact=fact*i;
      }
     return fact;
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n =sc.nextInt();
      int temp=n;
      int sum=0;
      while(n>0)
      {
        int digit=n%10;
        sum=sum+facto(digit);
        n=n/10;
      }
      if(temp==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}