import java.util.Scanner;

public class Q24_sumOdd
{
    public static void calSumOdd(int num) {
        int i;
        int sum = 0;
        for (i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of odd numbers is" + sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n = sc.nextInt();
        calSumOdd(n);
    }
}
