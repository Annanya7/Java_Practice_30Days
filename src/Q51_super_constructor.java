public class Q51_super_constructor
{
    Q51_super_constructor()
    {
        System.out.println(" base class constructor");
    }
}
class derived extends Q51_super_constructor
{
    derived()
    {
        super();
        System.out.println("dervied class constructor ");
    }
    derived(int x , int y)
    {
        super();
        System.out.println("parameters = " + (x + y));
    }
}
class result
{
    public static void main(String[] args)
    {
        derived obj = new derived();
        derived obj1 = new derived(20,30);

    }
}

