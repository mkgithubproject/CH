public class TriPrismDemo {
    public static void main(String[] args) {
        TriPrism<Integer>tp1=new TriPrism<Integer>();//create object ,generic type is Integer
        TriPrism<Double>tp2=new TriPrism<>();// generic type double , create object
        // set all instances for both objects
        tp1.setLength(10);
        tp1.setBase(7);
        tp1.setHeight(5);
        tp2.setLength(9.10);
        tp2.setBase(6.25);
        tp2.setHeight(4.20);
        // display data
        System.out.println("Triangular Prism 1");
        System.out.println("Length: "+tp1.getLength());
        System.out.println("Base: "+tp1.getBase());
        System.out.println("Height: "+tp1.getHeight());
        System.out.println("The volume of the triangular prism is "+tp1.getVolume());
        System.out.println("Triangular Prism 2");
        System.out.println("Length: "+tp2.getLength());
        System.out.println("Base: "+tp2.getBase());
        System.out.println("Height: "+tp2.getHeight());
        System.out.println("The volume of the triangular prism is "+tp2.getVolume());
    }

}
