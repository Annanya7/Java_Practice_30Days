import java.util.*;
public class Q22_displayTable
{
    public static void table(int num)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            int prod=num*i;
            System.out.println(num + "*" + i + "=" + prod);
        }
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        table(n);
    }
}
