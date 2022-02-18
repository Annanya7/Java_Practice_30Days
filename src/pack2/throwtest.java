package pack2;

public class throwtest {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
    //main method
    public static void main(String[] args)
    {
        throwtest obj = new throwtest();
        obj.checkNum(3);
        System.out.println("Rest of the code..");
    }

}
