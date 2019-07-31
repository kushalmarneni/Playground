import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       int res=frst(n1,n2);
       int tot=fin(res,n3);
       System.out.println(tot);
	}
   public static int frst(int n1,int n2)
   {
     int min,gcd=0;
     if(n1<n2)
       min=n1;
     else
       min=n2;
     while(min>=1)
     {
       if(n1%min==0 && n2%min==0)
       {
         gcd=min;
         break;
       }
       min--;
     }
     return gcd;
   }
  public static int fin(int res,int n3)
  { int min=0,gcd=0;
    if(res>n3)
      min=n3;
    else
      min=res;
    while(min>=1)
    {
      if(res%min==0 && n3%min==0)
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
}