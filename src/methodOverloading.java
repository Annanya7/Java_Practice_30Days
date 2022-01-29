// methods with different return type but same signatures cant be overloaded
public class methodOverloading
{
    int area(int l, int b)
    {
        int a=l*b;
        return a;
    }
    double area(double x)
    {
        double pi=3.14;
        double a = pi*x*x;
        return a;
    }
    int area(int y)
    {
        int a = y*y;
        return a;
    }
    public static void main(String[] args)
    {
        methodOverloading obj= new methodOverloading();
        System.out.println("Area of rectangle" + obj.area(10,20));
        System.out.println("Area of circle = " + obj.area(5.0));
        System.out.println("Area of a square = " + obj.area(5));

    }

}
