import java.util.*;
public class Q31_Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("enter the umber of values ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         int a=0;
         int b=1;
        System.out.println(a);
        System.out.println(b);
         int i=1;
         while(i<=n)
         {
             int c = a+b;
             System.out.println(c);
             a=b;
             b=c;
             i++;
         }
    }
}
