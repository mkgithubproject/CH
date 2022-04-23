package Boxes;
class RegularBox{
    // instance variables
    double length;
    double width;
    double height;
    String material;
   // constructor
    public RegularBox(double length, double width, double height, String material) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
    }
    // all the getters of instance variables
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }
   // to string method override
    @Override
    public String toString() {
        return "RegularBox{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", material='" + material + '\'' +
                '}';
    }
    // return package volume
    public double getPackageVolume(){
        return length*width*height;
    }
    // calculate and return cost of the package
    public double getPackageCost(){
        if(material.equalsIgnoreCase("carton")){
            return getPackageVolume()*0.045;
        }else if(material.equalsIgnoreCase("plastic")){
            return getPackageVolume()*0.0775;
        }else if(material.equalsIgnoreCase("wood")){
            return getPackageVolume()*0.135;
    }else{
        return -1;}
    }
}
// SquareBox class extends the RegularBox class
class SquareBox extends RegularBox{
    public SquareBox(double side,String material){
        super(side,side,side,material);
    }
   // override getPackageCost method
    @Override
    public double getPackageCost() {
        if(super.getPackageCost()==-1){
            return -1;
        }
        return (super.getPackageCost()*9)/10.0;// deduct 10%
    }
}
// testing
public class PackageTest {
    public static void main(String[] args) {
        RegularBox regBox1=new RegularBox(4,8,2,"carton");
        SquareBox sqBox1=new SquareBox(4,"carton");
        RegularBox regBox2=new RegularBox(4,8,2,"plastic");
        RegularBox regBox3=new RegularBox(4,8,2,"wood");
        SquareBox sqBox2=new SquareBox(3,"concrete");
        System.out.println("The volume of regBox1 is "+String.format("%.2f",regBox1.getPackageVolume())+" cubic inches");
        System.out.println("The cost of regBox1 is $"+String.format("%.2f",regBox1.getPackageCost()));
        System.out.println("The cost of regBox2 is $"+String.format("%.2f",regBox2.getPackageCost()));
        System.out.println("The cost of regBox3 is $"+String.format("%.2f",regBox3.getPackageCost()));
        System.out.println("The cost of sqBox1 is $"+String.format("%.2f",sqBox1.getPackageCost()));
        System.out.println("The cost of sqBox2 is $"+String.format("%.2f",sqBox2.getPackageCost()));

    }
}
