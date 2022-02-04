package pack1;

public class derived extends base{
    int fees;
    void get(int f)
    {
        System.out.println("derived");
        fees = f;
    }
    void display()
    {
        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("fees ="+fees);
    }
}
