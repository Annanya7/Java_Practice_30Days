public class Q65_connect
{
    Q64 o1;
    Q65_connect(Q64 o2)
    {
        o1= o2;
    }
    void disp1()
    {
        o1.display();
    }

    public static void main(String[] args)
    {
        Q64 obj = new Q64();
        Q65_connect obj2 = new Q65_connect(obj);





    }
}
