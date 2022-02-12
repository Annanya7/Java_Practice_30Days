package pack1;

public class int_to_string {
    public static void main(String args[])
    {
        int a =90;
        String j = String.valueOf(a);
        String k = Integer.toString(a);
        System.out.println("value of a ="+a);
        System.out.println("value of j ="+j);
        System.out.println("value of k ="+k);
        a = a+10;
        j = j+100;
        k = k+90;
        System.out.println("value of a ="+a);
        System.out.println("value of j ="+j);
        System.out.println("value of k ="+k);

    }
}
