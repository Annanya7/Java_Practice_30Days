import java.util.*;
public class Q30_powerNum
{
    public static void main(String[] args)
    {
        int i;
        int prod=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            prod=prod*x;

        }
        System.out.print(prod);
    }
}
