package Package2;

public class Box {
    public double length; //Class level Data.
    public double width;

    public double calculateArea(int length,int width)

    // Passing arguments.
    {
        double area = this.length * this.width;

        System.out.println("Area is " + area );
        return area;
    }
}
//Thank You :)

package Constructors;

public class TestBox {
    public static void main (String[] args){
        SmallBox obj = new SmallBox();
        obj.calculateArea();

        SmallBox ups = new SmallBox(3,4);
            ups.calculateArea();



    }
}
