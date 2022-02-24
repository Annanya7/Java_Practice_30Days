public class Q61_priority extends Thread
{
    public void run()
    {

            System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args)
    {
        Q61_priority obj= new Q61_priority();
        Q61_priority obj2 = new Q61_priority();
        Q61_priority obj3 = new Q61_priority();
        obj.setName("ananya");
        obj2.setName("ashima");
        obj3.setName("sanchi");
        obj.setPriority(3);
        obj2.setPriority(7);
        obj3.setPriority(2);

        obj.start();
        obj2.start();
        obj3.start();
    }

}
