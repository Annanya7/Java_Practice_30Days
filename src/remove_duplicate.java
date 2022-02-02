import java.util.HashSet;

public class remove_duplicate
{
    public static void main(String[] args)
    {
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        System.out.println(str);
        HashSet<Character> s = new HashSet<>(n-1);
        for(char x : str)
        {
            s.add(x);
        }
        for(char x : s)
        {
            System.out.println(x);
        }

    }
}
