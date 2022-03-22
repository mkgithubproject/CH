public class progDemo {
    public static void main(String[] args) {
        Shape sh = new Circle(1);
        System.out.println("The circle's area: " + sh.area());
        System.out.println("The circle's circumference: " + sh.circumference());
        sh = new Cylinder(2, 2);
        System.out.println("The cylinder's area: " + sh.area());
        System.out.println("The cylinder's circumference: " + sh.circumference());
        sh = new Square(4);
        System.out.println("The square's area: " + sh.area());
        System.out.println("The square's circumference: " + sh.circumference());

    }
}
