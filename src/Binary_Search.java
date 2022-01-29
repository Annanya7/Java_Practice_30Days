import java.util.Scanner;

public class Binary_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item");
        int item=sc.nextInt();
        int [] arr = {1,2,5,3,6,7,8};
        int beg=1;
        int end=7;
        int mid = (beg+end)/2;
        while(beg<= end && arr[mid] != item)
        {
            if(item < arr[mid] )
            {
                end=mid-1;
            }
            else
            {
                beg=mid+1;
            }
            mid = (beg+end)/2;
        }
        if(arr[mid]== item)
        {
            System.out.println("item found");
        }
        else
        {
            System.out.println("Item not found");
        }

    }
}
