package Cracking_coding_In;
import java.util.*;
public class Q1_unique_char
{
    boolean unique_chk(String s )
    {
     int i,j;
     for(i=0;i<s.length();i++)
     {
         for(j=i+1;j<s.length();j++)
         {
             if(s.charAt(i)==s.charAt(j))
             {
                 return false;
             }
         }
     }
     return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Q1_unique_char obj = new Q1_unique_char();
        if(obj.unique_chk(str))
        {
            System.out.println("The string " + str + " has all unique characters ");
        }
        else
        {
            System.out.println("The string " + str + " doesnt have all unique characters ");
        }

    }

    }