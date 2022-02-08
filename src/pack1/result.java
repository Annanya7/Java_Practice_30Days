package pack1;

public class result {
    public static void main(String args[])
    {
       /* abc obj1 = new abc();
                obj1.display();
    */
   /*  derived obj1 = new derived();
     obj1.get(101,"abc");
     obj1.get(3000);
     obj1.display();
    */
    base obj = new base(123,"hjy");
    obj.dis();
    obj.get(501);
    obj.dis();
    derived obj1 = new derived();
    obj1.show();
    }


}
