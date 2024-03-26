package Java0326Example1.Java0328Example1;

public class Triangle implements Shape{


    private double sideDown;

    private double sideLeft;

    private double sideRight;

    private double height;



    public Triangle() {
    }

    public Triangle(double sideDown,  double sideLeft, double sideRight, double height) {
        this.sideDown = sideDown;
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.height = height;
    }

    @Override
    public double calculateArea() {return (sideDown * height) / 2;}

    @Override
    public double calculatePerimeter() {
        return (sideLeft + sideRight + sideDown);
    }

}
