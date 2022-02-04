// error in copy constructor
public class Q46_copy_constructor
{
    int a, b;
    Q46_copy_constructor()
    {
        a = 5;
        b = 10;
    }
    void get( int x , int y)
    {
        a =x;
        b = y;
    }
    void disp()
    {
        System.out.println(" a " + a);
        System.out.println(" b " + b);
    }
    Q46_copy_constructor(Q46_copy_constructor s1)
    {
        a = s1.a ;
        b = s1.b ;
    }

    public static void main(String[] args)
    {
        Q46_copy_constructor obj = new Q46_copy_constructor();
        Q46_copy_constructor obj1 = new Q46_copy_constructor();
        obj1.get(10,20);
        Q46_copy_constructor obj2 = new Q46_copy_constructor(obj1);

    }
}
