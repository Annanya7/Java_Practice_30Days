public class Q42_Constructor_overloading
{
    Q42_Constructor_overloading(int x , int y)
    {
        int s;
        s= x+y;
        System.out.println("sum of 2 no" + s);
    }
    Q42_Constructor_overloading(int x, int y, int z)
    {
        int s;
        s = x+y+z;
        System.out.println("sum of 3 no " + s);
    }
    Q42_Constructor_overloading(int x , double y)
    {
        double s;
        s= x+y;
        System.out.println("Sum of 2 diff data types " + s);
    }

    public static void main(String[] args)
    {
        Q42_Constructor_overloading obj = new Q42_Constructor_overloading(10,20);
        Q42_Constructor_overloading obj1 = new Q42_Constructor_overloading(20,20,10);
        Q42_Constructor_overloading obj3 = new Q42_Constructor_overloading(10,20.9);
    }
}
