import java.lang.*;
public class Reverse_string
{
    public static void main(String[] args)
    {
        String name ="Ananya is studying";
        String res ="";
        int i,j;
        for(i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
        i=0;
        for(j=name.length()-1;j>=0;j--)
        {
            res= res+name.charAt(j);


        }
        System.out.println(res);
    }
}
