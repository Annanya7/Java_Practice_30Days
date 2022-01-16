import java.util.Scanner;

public class Q25_greatestNumber
{
    public static void calgreatest(int x, int y)
    {
        int i;
        if(x==y)
            System.out.println("Both numbers are equal");
        else if(x>y)
            System.out.println(x + " is greater");
        else if(x<y)
            System.out.println(x + " is smaller");
        else
            System.out.println("invalid");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calgreatest(a, b);
    }
}
