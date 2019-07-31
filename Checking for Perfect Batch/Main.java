import java.util.Scanner;
class Main{
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int a[] = new int[n];
           for(int i = 0; i < n; i++)
           {
                a[i] = sc.nextInt();
           }
perfect_batch(a, n);
}

public static void perfect_batch(int a[], int n)
{
boolean is_perfect_batch = true;
int batch_sum = a[0] + a[1] + a[2];
for(int i = 3; i <= n-1 ; i = i + 3) {
int curr_batch_sum = a[i] + a[i + 1] + a[i + 2];
if(curr_batch_sum != batch_sum)
{
is_perfect_batch = false;
}
}
if(is_perfect_batch == true)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}
}
}
