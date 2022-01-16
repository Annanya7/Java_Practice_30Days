import java.util.*;
public class Q20_factorial
{
    public static void calFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("invalid");
            return;
        }
        int i;
        int fac = 1;
        for(i=n;i>=1;i--)
        {
            fac= fac*i;
        }
        System.out.println(fac);
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         calFactorial(num);

    }
}
