import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
     int count[]=new int[k+1];
     for(int i=1;i<=k;i++)
     {
       count[i]=0;
     }
     int val;
     for(val=1;val<=k;val++)
     {
       for(int i=0;i<n;i++)
       {
         if(a[i]==val)
           count[val]++;
       }  
     }
     for(int i=1;i<=k;i++)
     {
       System.out.println(i+" "+count[i]);
     }
    }
}