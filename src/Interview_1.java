public class Interview_1
{
    static int x =0;
        public static void main(String args[]) {
            System.out.println(fun());
        }
        static int fun() {
            //static int x= 0; // local scope
            return ++x;
        }
    }
