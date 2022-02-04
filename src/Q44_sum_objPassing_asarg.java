public class Q44_sum_objPassing_asarg
{
    int a, b;
    Q44_sum_objPassing_asarg ()
    {
        a = 5;
        b = 10;
    }
    void get( int x , int y)
    {
         a =x;
         b = y;
    }
     void disp()
     {
         System.out.println(" a " + a);
         System.out.println(" b " + b);
     }
      void sum( Q44_sum_objPassing_asarg s1 , Q44_sum_objPassing_asarg s2)
      {
           a = s1.a + s2.a;
           b = s1.b + s2.b;
      }

    public static void main(String[] args)
    {
        Q44_sum_objPassing_asarg obj = new Q44_sum_objPassing_asarg();
        Q44_sum_objPassing_asarg obj1 = new Q44_sum_objPassing_asarg();
        Q44_sum_objPassing_asarg obj2 = new Q44_sum_objPassing_asarg(); // a = 5, b=10
        obj.disp(); // 5,10
        obj1.get(10,20); // 10,20
        obj1.disp();
        obj2.sum(obj , obj1);
        obj2.disp(); //15, 30


    }
}
