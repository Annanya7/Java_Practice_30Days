public class Q15_number_pyramid
{
    public static void main(String[] args)
    {
     int i,j;
     int n=5;
     for(i=1;i<=n;i++)
     {
         int sp = n-i;
         for(j=1;j<=sp;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=i;j++)
         {
             System.out.print(i + " ");
         }
         System.out.println(" ");
     }
    }
}
