import java.util.*;
public class Bubble_sort
{
    public static void main(String[] args)
    {
        int i,j,temp;
        int [] arr= new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // unsorted
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // sorted
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }

    }
}
