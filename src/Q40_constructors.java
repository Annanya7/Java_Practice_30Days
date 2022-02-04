// default constructor
public class Q40_constructors
{
    int id;
    String name;
    Q40_constructors()
    {
        id=100;
        name="Ana";
    }
    void get(int i, String n)
    {
        id=i;
        name=n;
    }
    void disp()
    {
        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }

    public static void main(String[] args)
    {
        Q40_constructors obj = new Q40_constructors();
        obj.get(109,"Amira");
        obj.disp();
        Q40_constructors obj1 = new Q40_constructors();
        obj1.disp();

    }

}
