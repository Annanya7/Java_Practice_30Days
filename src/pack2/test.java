package pack2;

public class test {
    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative, cannot calculate square");
        }
        else {
            System.out.println("Square of " + num + " is " + (num*num));
        }
    }
    //main method
    public static void main(String args[])
    {
        test obj = new test();
        try {
            obj.checkNum(-3);
        }
        catch (Exception e)
        {
            System.out.println("handled");
        }
        System.out.println("Rest of the code..");
    }

}
