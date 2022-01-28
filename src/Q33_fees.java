import java.util.*;
public class Q33_fees
{
    int id,fees;
    String name;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        id=sc.nextInt();
        fees=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
    }
    void disp()
    {
        System.out.println("The name =" + name);
        System.out.println("The fees is =" + fees);
        System.out.println("The id is + " + id);
    }

    public static void main(String[] args)
    {
        Q33_fees obj= new Q33_fees();
        obj.get();
        obj.disp();
    }


}
