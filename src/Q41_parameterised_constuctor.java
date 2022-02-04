public class Q41_parameterised_constuctor
{
    int id;
    String name;
    Q41_parameterised_constuctor(int i, String n)
    {
        id = i;
        name= n;
    }
    void disp()
    {
        System.out.println("id " + id) ;
        System.out.println("name is " + name);
    }

    public static void main(String[] args)
    {
        Q41_parameterised_constuctor obj = new Q41_parameterised_constuctor(10, "Ana");
        obj.disp();

    }

}
