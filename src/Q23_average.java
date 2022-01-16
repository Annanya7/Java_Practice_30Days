import java.util.*;
public class Q23_average
{
    public static void calAverage(int num,int x, int y, int z)
    {
        int sum;
        float avg=0;
        sum=x+y+z;
        avg=sum/num;
        System.out.println("Average of three numbers is" + avg);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calAverage(n,a,b,c);
    }
}
