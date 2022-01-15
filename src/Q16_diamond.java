public class Q16_diamond {
    public static void main(String[] args) {
        int i, j;
        int n = 4;
        for (i = 1; i <= n; i++) {
            int sp = n - i;
            for (j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int star = (2 * i) - 1;
            for (j = 1; j <= star; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for (i = n; i >= 1; i--) {
            int sp = n - i;
            for (j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int star = (2 * i) - 1;
            for (j = 1; j <= star; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
