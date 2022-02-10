import java.lang.*;
import java.util.Locale;

public class Strings_Q1
{
    public static void main(String args[]) {
        String s = "Ananya";
        String s1 = "Ananya";
        String s6 = "ananya";
        System.out.println(s1==s);
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3==s4);
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3));
        System.out.println(s6.equalsIgnoreCase(s1));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.length());
        s1.concat("web");
        System.out.println(s1.substring(s1.length()-1));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(s1.concat("web"));
        s1 = s1.toUpperCase();
        System.out.println(s1);


    }
}
