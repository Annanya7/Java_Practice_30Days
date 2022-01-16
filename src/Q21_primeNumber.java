import java.util.*;
public class Q21_primeNumber
{
    public static void calPrime(int num)
    {
        int i=2;
        int c=0;
        if(num==0 || num==1)
        {
            System.out.println("not prime number");
        }
        while(i<num)
        {
            if(num%i==0)
            {
                c=c+1;
            }
           else
            {
               continue;
            }
            i=i+1;
            if(c==0)
            {
                System.out.println(num + " Is a prime number");
                break;
            }
            else
            {
                System.out.println(num + "is not a prime number");
                break;
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
        calPrime(val);

    }
}
