import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int res=btwo(n1,n2);
      int big=bthr(res,n3);
      System.out.println(big);
	}
  public static int btwo(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
  public static int bthr(int res,int n3)
  {
    if(res>n3)
      return res;
    else
      return n3;
  }
}