import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      int frst=num%10;
      int trd= num/100;
      int sum= frst+trd;
      System.out.println(sum);
	}
}