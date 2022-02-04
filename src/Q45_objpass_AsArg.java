// passing object as an argument and then copying its values
public class Q45_objpass_AsArg
{
    int id;
    String name;
    Q45_objpass_AsArg()
    {
        id = 10;
        name = "Ana";
    }
    void get(int i , String n)
    {
        id = i;
        name = n;
    }
    void disp()
    {
        System.out.println(" the id " + id);
        System.out.println(" the name " + name);
    }
    void copy( Q45_objpass_AsArg s)
    {
        id = s.id;
        name = s.name;
    }

    public static void main(String[] args)
    {
        Q45_objpass_AsArg obj = new Q45_objpass_AsArg();
        obj.disp();
        Q45_objpass_AsArg obj1 = new Q45_objpass_AsArg();
        obj1.disp();
        obj1.get(11, "Amira");
        obj1.disp();
        obj.copy(obj1);
        obj.disp();




    }

}
