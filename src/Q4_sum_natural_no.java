import java.util.Scanner;

public class Q4_sum_natural_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
