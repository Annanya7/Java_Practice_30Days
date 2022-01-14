public class Q12_Floyd_Triangle
{
    public static void main(String[] args)
    {
     int i,j;
     int c=1;
     for(i=1; i<=5 ; i++)
     {
         for(j=1; j<=i; j++)
         {
             System.out.print(  c  );
             c=c+1;
         }
         System.out.println("  ");
     }
    }
}
