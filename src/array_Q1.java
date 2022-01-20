import java.util.*;
public class array_Q1
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        String name []= new String[size];
        for(i=0;i<=size;i++)
        {
            Scanner s = new Scanner(System.in);
            name[i] = sc.nextLine();
            System.out.println(name[i]);

        }



    }
}
