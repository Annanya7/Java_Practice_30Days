import java.util.Scanner;

public class Q4_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. add, 2.substract, 3.multiply , 4.divide ,5. modulus");
        System.out.println("Enter your choice");
        int num = sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        double res;
        switch(num)
        {
            case 1:
                res=a+b;
                System.out.println(res);
                break;

            case 2:
                res=a-b;
                System.out.println(res);
                break;

            case 3:
                res=a*b;
                System.out.println(res);
                break;

            case 4:
                res=a/b;
                System.out.println(res);
                break;


            case 5:
                res=a%b;
                System.out.println(res);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}
