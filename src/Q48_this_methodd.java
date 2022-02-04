public class Q48_this_methodd
{
    void display()
    {
        System.out.println("display");
    }
    void show()
    {
        this.display();
        System.out.println("show");
    }
    public static void main(String args[])
    {
        Q48_this_methodd obj1 = new Q48_this_methodd();
        obj1.show();

    }
}
