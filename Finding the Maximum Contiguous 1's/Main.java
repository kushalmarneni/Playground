import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int j=0;j<n;j++)
        a[j]=sc.nextInt();
      int count[]=new int[5];
      for(int i=0;a[i]!=0;i++)
        count[0]++;
       /*for(int k=0;k<n;k++)
      {
        if(count[k]>max)
        {
          max=count[k];
        }
      }*/
      System.out.println(count[0]);
    }
}