import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first=num%10;
      int sum=0;
      while(num>10)
      {
        num=num/10;  
      }
      int last=num%10;
      System.out.println(first+last);
        
	}
}