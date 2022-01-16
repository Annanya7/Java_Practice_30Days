import java.util.Scanner;

public class Q18_sumFunc
{
    public static int sum(int a, int b)
    {
        int s = a+b;
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int result = sum(x,y);
        System.out.println("sum of two numbers is"+ result);
    }
}
