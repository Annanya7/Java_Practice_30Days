public class Q49_constructor_this 
{
    Q49_constructor_this (int x , int y)
    {
        this(67,45,23);

        int s;
        s= x+y;
        System.out.println("sum of 2 no" + s);
    }
    Q49_constructor_this (int x, int y, int z)
    {
        this(67,89.6);
        int s;
        s = x+y+z;
        System.out.println("sum of 3 no " + s);
    }
    Q49_constructor_this (int x , double y)
    {
        double s;
        s= x+y;
        System.out.println("Sum of 2 diff data types " + s);
    }

    public static void main(String[] args)
    {
        Q49_constructor_this  obj = new Q49_constructor_this (10,20);

    }
}
