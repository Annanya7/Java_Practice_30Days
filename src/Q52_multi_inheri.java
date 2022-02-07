public class Q52_multi_inheri
{
    Q52_multi_inheri( int x , int y)
    {
        System.out.println(" sum " + (x+y));
    }
    Q52_multi_inheri(int x , int y , int z )
    {
        System.out.println("sum of three no " + (x+y+z));
    }
}
class derived1 extends Q52_multi_inheri
{
    derived1()
    {
        super(30,40);
    }
    public static void main(String args[])
    {

    }

}

