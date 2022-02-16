import java.util.Scanner;
import java.util.*;
public class Q57
{
        public static void main(String[] args) {
            int ar[]= new int[10];
            int n,a,b,c;
            Scanner sc = new Scanner(System.in);

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
                catch (ArithmeticException e) {
                    System.out.println(e);
                }
                finally {
                    System.out.println("finally");
                }



            System.out.println("end");
        }
    }
