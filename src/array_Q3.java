import java.util.*;
public class array_Q3       // error array index out of bound
{
    public static void main(String[] args)
    {
        int i,j;
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int [] arr = new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();// input values
        }
        for(j=0;j<arr.length;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
            if(arr[j]<min)
            {
                min=arr[j];
            }
            else
            {
                System.out.println("Numbers are equal");
            }
            System.out.println("The maximum no is" + max);
            System.out.println("the minimum no is" + min);
        }
    }
}
