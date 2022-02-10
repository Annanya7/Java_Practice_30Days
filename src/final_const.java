public class final_const
{
     final_const()
    {
        // hence constructor cant be final
        System.out.println("Final constructor not allowed ");
    }

    public static void main(String[] args)
    {
        final_const obj = new final_const();

    }
}
