import java.util.*;
// Method overloading cannot be done when data type varies in position
public class methOverload2
{
    void cal(int x , long y)
    {
        long  s = x+y;
        System.out.println("sum 1 =" + s);
    }
    void cal(long x, int y)
    {
        long s = x+y;
        System.out.println("sum 2 = " + s);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextInt();
        methOverload2 obj = new methOverload2();
        obj.cal(a,b);
        obj.cal(a,b);
    }
}
