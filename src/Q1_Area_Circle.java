import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Q1_Area_Circle
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double pi = 3.14;
        double area;
        double m;
        m=Math.pow(a,b);
        area = pi * m;
        System.out.println(area);
    }

}
