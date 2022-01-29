import java.util.*;
public class Q35_withReturn_withArgs
{
    int sum(int x,int y)
    {
        int s=x+y;
        return s;
    }
    double avg(int x,int y)
    {
        double a = (x+y)/2.0;
        return a;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        Q35_withReturn_withArgs obj = new Q35_withReturn_withArgs();
        int p=obj.sum(a,b);
        System.out.println("the sum=" + p);
        double q=obj.avg(a,b);
        System.out.println("Average =" + q);
        System.out.println("Average of two numbers is = "+ obj.avg(30,40));


    }
}
