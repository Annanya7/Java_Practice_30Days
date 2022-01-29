import java.util.*;
public class Q36_withReturn_noArg
{
    int n1,n2;
    void get(int x, int y)
    {
        n1=x;
        n2=y;
    }
    int sum()
    {
        return n1+n2;
    }
    double avg()
    {
        return (n1+n2)/2.0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Q36_withReturn_noArg obj = new Q36_withReturn_noArg();
        obj.get(a,b);
        System.out.println("sum" +  obj.sum());
        System.out.println("avg" + obj.avg());

    }
}
