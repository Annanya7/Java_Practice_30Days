import java.util.*;
public class Q34_noReturn_withArgs
{
    int n1,n2,avg,sum;
    void get(int x, int y)
    {
        n1=x;
        n2=y;
    }
    void cal()
    {
        sum=n1+n2;
        avg=sum/2;
    }
    void disp()
    {
        System.out.println("Average ="+ avg);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Q34_noReturn_withArgs obj = new Q34_noReturn_withArgs();
        obj.get(a,b);
        obj.cal();
        obj.disp();
    }
}
