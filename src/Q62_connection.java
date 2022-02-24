import java.util.*;
public class Q62_connection
{
    int id;
    int no;
    Q62_connection()
    {
        id=101;
        no=11;

    }
    void get(int i, int j)
    {
        id=i;
        no=j;
    }
    void display()
    {
        System.out.println("The id =" + id);
        System.out.println("The number =" + no);
    }

    public static void main(String[] args)
    {
        Q62_connection obj = new Q62_connection();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        obj.get(a,b);
        obj.display();
    }

}
