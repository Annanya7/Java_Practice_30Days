public class Q10_inverted_half_pyramid_withno
{
    public static void main(String[] args) {
        int i, j;
        int c=1;
        for (i = 1; i <= 5; i++)
        {
            for(j=5; j>=i; j--)
            {
                System.out.print(j);
            }
            System.out.println("  ");
        }

        }
}