import java.util.Scanner;
class Main{
	public static int pow(int base,int expo)
    {
      int resu=1;
      if(expo==0)
      {
        return 1;
      }
      else
      {
        while(expo!=0)
        {
          resu=resu*base;
          expo=expo-1;
        }
        return resu;
      }
    }
     public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int expo=sc.nextInt();
      int res=pow(base,expo);
	  System.out.println(res);
    }
}
