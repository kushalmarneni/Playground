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
       sort(n,a);
    }
  public static void sort(int n,int a[])
  {
    int i=0,j=0;
    int b[]=new int[n];
    while(i<n)
    {
      if(a[i]>0)
      {
        b[j]=a[i];
        i++;
        j++;
      }
      else
        i++;    
    }
    while(i<n)
    {
      if(a[i]==0)
      {
        b[j]=a[i];
        j++;
        i++;
      }
    }
    for(int k=0;k<n;k++)
    {
      System.out.print(b[k]+" ");
    }
  }
}





