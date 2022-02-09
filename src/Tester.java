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
