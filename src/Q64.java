import java.util.Scanner;

public class Q64
{
    int id;
    Q64()
    {
        id=101;

    }
    void get(int i)
    {
        id=i;
    }
    void display()
    {
        System.out.println("The id =" + id);
    }

    public static void main(String[] args)
    {
        Q64 obj = new Q64();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        obj.get(a);
        obj.display();
    }

}
