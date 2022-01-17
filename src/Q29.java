import java.util.Scanner;

public class Q29
{
    public static void main(String[] args) {
        int i;
        int p=0,n=0,z=0;
        for(i=-1;i<=10;i++)
        {
            if(i>0)
            {
                p=p+1;
                System.out.println(i+ " Is a positive number");
            }
            else if(i<0)
            {
                n=n+1;
                System.out.println(i + "is a negative number");
            }
            else if(i==0)
            {
                z=z+1;
                System.out.println("is a zero");
            }
        }
    }
}