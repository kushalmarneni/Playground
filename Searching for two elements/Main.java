import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s1index=-1;
        int s2index=-1;
        for(i=0;i<n;i++)
        {
          if(s1==a[i])
          {
            s1index=i;
          }
          if(s2==a[i])
          {
            s2index=i;
          }
        }
      System.out.println(s1index);
      System.out.println(s2index);
       
    }
}