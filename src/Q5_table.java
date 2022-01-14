import java.util.Scanner;

public class Q5_table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table is to be printed");
        int n = sc.nextInt();
        int i;
        for (i = 0; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}
