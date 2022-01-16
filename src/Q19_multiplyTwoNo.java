import java.util.*;
public class Q19_multiplyTwoNo
{
    public static float calproduct(float x, float y)
    {
        float prod;
        prod = x*y;
        return prod;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = calproduct(a,b);
        System.out.println("Product of two numbers is " + result);
    }
}
