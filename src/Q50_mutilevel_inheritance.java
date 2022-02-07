public class Q50_mutilevel_inheritance
{
    void show()
    {
        System.out.println("in first class ");
    }

}
 class B extends Q50_mutilevel_inheritance
{
     void dis()
    {

        System.out.println("in second class");
    }


}
class c extends B
{
    void show()
    {
        super.show();
        System.out.println("in class c ");
    }

}
class Result1
{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.show();
        //super.show();
        // why protected show will not be accessible?
    }
}