abstract public class Q53_abstract_class
{
     abstract void show();

}
class B1 extends Q53_abstract_class
{
    void show()
    {
        System.out.println("Abstract method of base class");
    }
}
class C1 extends Q53_abstract_class
{
    void show()
    {
        System.out.println("Hello world ");
    }
}
class D1 extends Q53_abstract_class
{
    void show()
    {
        System.out.println("Abstract method i class 3 ");
    }
}
class res
{
    public static void main(String[] args)
    {
        D1 obj = new D1();
        C1 obj1 = new C1();
        B1 obj2 = new B1();
        obj.show();
        obj1.show();
        obj2.show();
    }
}
