package Cracking_coding_In;
import java.util.*;
public class unique_char_Using_sets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch []= s.toCharArray();
        int len = ch.length;
        for(int i=0;i<len ; i++)
        {
            System.out.println(ch[i] + "\t"); // printing the character array
        }
        System.out.println(" ");
        // creating a hashset as it doesnt take duplicate values
        HashSet<Character> hs = new HashSet<>();
        for(char i : ch)
        {
            hs.add(i);
        }
        for(char i : hs)
        {
            System.out.println(i);
        }
        String str =hs.toString();
        System.out.println(str);
        // comparing the size of hashset with the original length of character array s
        if(hs.size()==len)
        {
            System.out.println("No duplicates ");
        }
        else
        {
            System.out.println("there are duplicates ");
        }



    }
}


