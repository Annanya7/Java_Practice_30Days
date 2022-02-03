import java.util.*;
public class string_count_words
{
    public static void main(String[] args)
    {
        String str ="Amira is a good girl";
        int i;
        String split[] = str.split(" ");
        System.out.println(split);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(i=0;i<split.length;i++)
        {
            if(hm.containsKey(split[i]))
            {
                int count = hm.get(split[i]);
                hm.put(split[i], count+1);
            }
            else
            {
                hm.put(split[i], 1);
            }

        }
        System.out.println(hm);


    }
}
