package pack1;

public class base {
    int id;
    final String name;
    base()
    {
        id=901;
        name="nhkljkl";
    }
    base(int i,String n)
    {
        id= i;
        name = n;
    }
    void get(int i)
    {
        System.out.println("base");
        id= i;

    }
    void dis()
    {
        System.out.println(id);
        System.out.println(name);
    }
final void show()
{
    System.out.println("show");
}
}
