import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int j=0;j<n;j++)
        a[j]=sc.nextInt();
    int count[]=new int[10];
    for(int k=0;k<n;k++)
      count[k]=0;
    for(int i=0;i<n;i++)
    {
      count[a[i]]++;
    }
    int max=0;
    int j;
    for(j=0;j<10;j++)
    {
      if(count[j]>max)
        max=count[j];
      //System.out.println(" "+j+" "+max);
      
    }
    int repeat=0;
    for(int k=0;k<n;k++)
    {
      if(count[k]>1)
      {
        repeat=1;
        break;
      }
    }
    if(repeat==1)
       System.out.println(max);
    else
      System.out.println(a[0]);
  }
}