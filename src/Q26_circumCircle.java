import java.util.Scanner;

public class Q26_circumCircle
{
    public static void calcircumference(int rad)
    {
        double circum;
        double pi = 3.14;
        circum=2*pi*rad;
        System.out.println("Circumference of a circle" + circum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        calcircumference(r);
    }
}
