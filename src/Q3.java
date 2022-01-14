import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
        {
            System.out.println("a is greater");
        }
        else
            {
                if (a < b)
                    {
                        System.out.println("a is smaller");
                    }
                else
                    {
                        System.out.println("Both no are equal");
                    }

        }
    }
}