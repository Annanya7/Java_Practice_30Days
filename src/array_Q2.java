import java.util.*;
public class array_Q2
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(); // number to be searched
        int [] arr=new int[3];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); //input the values
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]); //output the values
        }
        for(j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
                break;
            }
        }
        System.out.println("The element is " + x + " At position " + j);
    }
}
