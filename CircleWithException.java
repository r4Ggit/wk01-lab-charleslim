import java.util.Scanner;
public class CircleWithException{
    private double radius;
    //private double area;
    //private double diameter;
    final double PI = 3.1415;

    public CircleWithException()
    {
        this.radius = 0;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius) throws Exception
    {
        if(radius < 0)
        {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getArea() throws Exception
    {
        if(PI*this.radius*this.radius > 1000)
        {
            throw new Exception("Radius with area greater than 1000 not allowed");
        }
        return(PI*this.radius*this.radius);
    }

    public double getDiameter()
    {
        return(this.radius*2);
    }

    public static void main(String[] args){

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter radius of circle: ");
            double radius =  scan.nextDouble();
            scan.close();
            CircleWithException circle = new CircleWithException();
            circle.setRadius(radius);
            circle.getArea(); // to check for issues
            System.out.println("Radius of circle is: " + circle.getRadius() );
            System.out.println("Area of circle is: " + circle.getArea() );
            System.out.println("Diameter of circle is: " + circle.getDiameter() );
        } catch (Exception e) {
            System.err.println(e);
        }
    }


}
