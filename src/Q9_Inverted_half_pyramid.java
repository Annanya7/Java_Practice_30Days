/*     _ _ _ *
       _ _ * *
       _ * * *
       * * * *
 */

public class Q9_Inverted_half_pyramid
{
    public static void main(String[] args)
    {
        int n =4;
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n-i; j++)
            {
                System.out.print(" _ ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }
}
