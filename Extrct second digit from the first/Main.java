import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num>100)
    {
      num=num/10;
    }
    int sec=num%10;
    System.out.println(sec);  
	}
}
