public class Q60_threadsss  extends Thread
{
   public void run() {
       for (int i = 1; i <= 5; i++) {
           try {
               Thread.sleep(500);
           }
           catch (Exception e)
           {
               System.out.println("handled");
           }
           System.out.println(i);
       }
   }

    public static void main(String[] args)
    {
        Q60_threadsss obj= new Q60_threadsss();
        Q60_threadsss obj2 = new Q60_threadsss();
        Q60_threadsss obj3 = new Q60_threadsss();
        obj.start();
        try
        {
            obj.join(1500);
        }
        catch (Exception e)
        {
            System.out.println("handled");
        }
        obj2.start();
        obj3.start();
        System.out.println("thread 1 "+obj.getName());
obj.setName("ananya");

        System.out.println("thread 1 "+obj.getName());
        System.out.println("thread 2 "+obj2.getName());

        System.out.println("thread 3 "+obj3.getName());


    }

}
