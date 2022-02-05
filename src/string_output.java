public class string_output
{
    public static void main(String[] args)
    {
        // Q1
        System.out.println("******************* Q1 *******************");
        System.out.print('j' + 'a' + 'v' + " \n");
        System.out.print("j" + "a" + "v");
        // Q2
        System.out.print("******************* Q2********************");
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;
        // int value - -128 to 127 - same reference but value above that it changes the reference
        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}
