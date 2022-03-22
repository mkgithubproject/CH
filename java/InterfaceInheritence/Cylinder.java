public class Cylinder extends Circle{
    private double height; // instance variable
    public Cylinder(double radius, double height) { // constructor
        super(radius); // call parent class constructor
        this.height = height;
    }

    @Override
    // function overriding
    public double area() {
        return (2*pi*radius*height)+(2*pi*radius*radius);
    }
    // function overriding
    @Override
    public double circumference() {
        return 2*pi*radius;
    }
}
