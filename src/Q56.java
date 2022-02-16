import java.util.Scanner;
import java.util.*;
public class Q56 {
    public static void main(String[] args) {
        int ar[]= new int[10];
        int n,a,b,c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("entered try block 1");
            try {
                System.out.println("enter another try 2");
                System.out.println("enter a");
                a = sc.nextInt();
                System.out.println("enter b");
                b = sc.nextInt();
                c=a/b;
                System.out.println("value of c = "+c);
                System.out.println("leaving another try");

            }
            catch (Exception e) {
                System.out.println(e);
            }
            try {

                System.out.println("enter n");
                n = sc.nextInt();
                ar[n] = 90;


                System.out.println("value at index n =" + ar[n]);
                System.out.println("leaving try2");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

            System.out.println("leaving");

        }

        catch(Exception e)
        {
            System.out.println(e);
        }


        System.out.println("end");
    }
}
