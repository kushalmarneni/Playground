import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      pairs(n,a,value);
    }
    public static void pairs(int n,int a[],int value)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if((a[i]+a[j])==value)
        {
          System.out.println(a[i]+", "+a[j]);
        }
       }
    }
  }
}
