import java.util.Scanner;
import java.util.*;
public class Q56 {
    public static void main(String[] args) {
        int ar[]= new int[10];
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("entered try block");
            System.out.println("enter n");
            n = sc.nextInt();
            ar[n] =90;


            System.out.println("value at index n =" + ar[n]);
            System.out.println("leaving");

        } catch (ArithmeticException e) {
            System.out.println("handled");
        }
        System.out.println("end");
    }
}
