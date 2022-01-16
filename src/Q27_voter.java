import java.util.Scanner;

public class Q27_voter
{
    public static void checkAge(int a)
    {
        if(a>=18)
            System.out.println("Allowed to vote");
        else if(a<18)
            System.out.println("Not allowed to vote");
        else
            System.out.println("invalid age");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        checkAge(age);
    }
}
