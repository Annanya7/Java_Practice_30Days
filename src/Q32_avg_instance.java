import java.util.*;
public class Q32_avg_instance
{
    int n1,n2,avg,sum;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        n1=sc.nextInt();
        n2=sc.nextInt();
    }
    void cal()
    {
        sum=n1+n2;
        avg=sum/2;
    }
    void disp()
    {
        System.out.println("sum =" + sum);
        System.out.println("Average="+ avg);
    }
    public static void main(String[] args)
    {
        Q32_avg_instance obj = new Q32_avg_instance();
        obj.get();
        obj.cal();
        obj.disp();
        Q32_avg_instance obj1 = new Q32_avg_instance();
        obj1.get();
        obj1.cal();
        obj1.disp();
    }
}
