package Cracking_coding_In;
import java.util.*;
public class Using_sort_ASCII
{
    boolean check_unique()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch_array[] = str.toCharArray();
        int i;
        int len = str.length();
        //Sorting the character array
        Arrays.sort(ch_array);
        for(i=0;i<len-1;i++)
        {
            if(ch_array[i] != ch_array[i+1])
            {
                continue;
            }
            else
                return false; // exlain flow of false
        }
        return true;

    }
    public static void main(String[] args)
    {
        Using_sort_ASCII obj = new Using_sort_ASCII();
        if(obj.check_unique())
            System.out.println("No duplicates present");
        else
            System.out.println("Not unique");
    }

}
