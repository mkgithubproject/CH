public class Circle implements Shape{
    // instance variable
     double radius;
     double pi = 3.14;
  // constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // define shape interface methods
    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double circumference() {
        return 2*pi*radius;
    }
}
