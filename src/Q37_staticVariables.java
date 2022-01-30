import java.util.*;
//static varibales are common to the entire class
public class Q37_staticVariables
{
    int id;
    static int count =0;
    String name;
    void get(String n)
    {
        name=n;
        count++;
        id=count;
    }
    void disp()
    {
        System.out.println("ID is = " + id);
    }
    static void show_count()
    {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Q37_staticVariables obj = new Q37_staticVariables();
        Q37_staticVariables obj1 = new Q37_staticVariables();
        Q37_staticVariables obj2 = new Q37_staticVariables();
        obj.get(a);
        //obj2.show_count();
        obj1.get("Rahul");
        obj2.get("Sahil");
        //obj2.show_count();
        obj.disp();
        obj1.disp();
        obj2.disp();
        Q37_staticVariables.show_count();
        //obj.show_count();
        //obj1.show_count();
        //obj2.show_count();

    }
}
