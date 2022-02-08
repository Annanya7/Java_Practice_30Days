import java.util.*;
public class Tester
{
        public static void main(String[] args) {
            // Implement your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp = n;
            int rev = 0;
            int rem;
            while(n !=0)
            {
                rem = n%10;
                rev = (rev*10) + rem;
                n=n/10;
            }
            if(rev == temp)
            {
                System.out.println(temp + " is a palindrome");
            }
            else
            {
                System.out.println(temp + " is not a palindrome ");
            }
        }
    }
//Runtime Exception
//Exception in thread "main" java.util.NoSuchElementException
//at java.util.Scanner.throwFor(Scanner.java:862)
//at java.util.Scanner.next(Scanner.java:1485)
//at java.util.Scanner.nextInt(Scanner.java:2117)
//at java.util.Scanner.nextInt(Scanner.java:2076)
//at Tester.main(file.java:10)
// why the error???????????????