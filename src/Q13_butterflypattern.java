public class Q13_butterflypattern
{
    public static void main(String[] args)
    {
        int i,j;
        int n=4;
        // upper half
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int sp= 2*(n-i);
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //lower half
        for(i=4;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int sp= 2*(n-i);
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
