import java.util.*;
public class Linear_Search
{
    public static void main(String[] args)
    {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[10];
        System.out.println("Enter the elements in an array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //printing the elements
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int item=sc.nextInt();
        arr[n+1]=item;
        i=0;
        while(arr[i] != item)
        {
            i=i+1;

        }
        if(i==n+1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Item found");
        }
    }
}
