import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int temp=n;
      while(n>0)
      {
        int digit=n%10;
        sum=sum+digit*digit*digit;
        n=n/10;
      }
      if(sum==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}