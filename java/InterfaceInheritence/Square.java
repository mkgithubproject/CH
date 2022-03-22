public class Square implements Shape{
    double side;// instance variable
   public Square(double side){// constructor
       this.side=side;
   }
    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double circumference() {
        return 4*side;
    }
}
