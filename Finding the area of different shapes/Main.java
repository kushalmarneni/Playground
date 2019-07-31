import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int sw=sc.nextInt();
      switch(sw)
      {
        case 1:int side=sc.nextInt();
               System.out.println(side*side);
               break;
        case 2: int len=sc.nextInt();
                int br=sc.nextInt();
                System.out.println(len*br);
                break;
        case 3: int base=sc.nextInt();
                int hgt=sc.nextInt();
                System.out.println(0.5*base*hgt);
                break;
        case 4: int r=sc.nextInt();
                System.out.println(3.14*r*r);
                break;
        default:System.out.println("enter again");
      }
    }
}