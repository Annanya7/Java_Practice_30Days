import java.io.IOException;
import java.util.*;

/* Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
*/
public class array_Q4 // why array index out of bound ????
{
    public static void main(String[] args) throws IOException
    {
        int i;
        int[] arr={1,2,4,7};
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else
            {
                System.out.println("Not in ascending order");
                break;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Ascending order");
    }
}
