import java.util.*;
public class Q6_Del_Array
{
    public static void main(String[] args)
    {
        int n,i,item,ind,j;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[10];
        System.out.println("Enter the elements in an array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        //deleting an element;
        System.out.println("Enter the index at which it is to be deleted");
        ind=sc.nextInt();
        item=arr[ind];
        for(j=ind;j<n;j++)
        {
            arr[j]=arr[j+1];
        }
        n=n-1;
        //array after deletion
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
