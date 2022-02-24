public class Q63
{
    Q62_connection obj;
    Q63(Q62_connection o1)
    {
    obj = o1;
    }
    void disp()
    {
    obj.display();
    }

    public static void main(String[] args)
    {
       Q62_connection s1 = new Q62_connection();
       Q62_connection s2 = new Q62_connection();
       s2.get(301,9896);
       Q63 qw = new Q63(s1);
       Q63 er = new Q63(s2);
       qw.disp();
       er.disp();

    }
}
