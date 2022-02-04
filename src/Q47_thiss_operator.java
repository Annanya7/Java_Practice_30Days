import java.sql.SQLOutput;

public class Q47_thiss_operator {
    int id,fees;
    String name;
    void get(int id, String name,int fees)
    {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }
    void display()
    {
        System.out.println("id "+id);
        System.out.println("name = "+name);
        System.out.println("fees = "+fees);
    }
    public static void main(String args[])
    {
        Q47_thiss_operator obj1 = new Q47_thiss_operator();
        obj1.get(101,"abc",3000);
        obj1.display();
    }
}
