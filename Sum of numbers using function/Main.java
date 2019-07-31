import java.util.Scanner;
class Main{
  static int sum(int n)
  {
    int tot=0;
    int i=0;
    while(i<=n)
    {
      tot=tot+i;
      i++;
    }
    return tot;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
	}
}