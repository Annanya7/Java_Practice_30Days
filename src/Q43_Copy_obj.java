public class Q43_Copy_obj
{
    int x=1 , y=2;
    int s;
    Q43_Copy_obj()
    {
         x =10;
        y =20;
         s = x+y;
    }
    Q43_Copy_obj(int x , int y)
    {
        x= x;
        y = y;
        s=x+y;
    }
    void disp()
    {
        System.out.println("sum " + s);

    }

    public static void main(String[] args)
    {
        Q43_Copy_obj obj = new Q43_Copy_obj();
        obj.disp();
        Q43_Copy_obj obj1 = new Q43_Copy_obj(11,12);
        obj1.disp();
        obj=obj1;
        obj.disp();
    }
}
