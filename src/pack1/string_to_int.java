package pack1;

public class string_to_int {
    public static void main(String[] args) {
        String s ="123";
        int k = Integer.parseInt(s);
        int j = Integer.valueOf(s);
        System.out.println("s = "+s);
        System.out.println("k = "+k);
        System.out.println("j = "+j);
        s= s+10;
        k = k+80;
        j = j+56;
        System.out.println("s = "+s);
        System.out.println("k = "+k);
        System.out.println("j = "+j);

    }
}
