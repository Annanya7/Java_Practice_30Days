public interface Q55_interfaceee
{
    void disp1();
}
interface B3 extends Q55_interfaceee
{
    void show();
}
class C3 implements B3
{
   public void disp1()
    {
        System.out.println(" Display function of first interface ");
    }
    public void show()
    {
        System.out.println("Display function of second interface");
    }

    public static void main(String[] args)
    {
        C3 obj = new C3();
        obj.disp1();
        obj.show();

    }
}
