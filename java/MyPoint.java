public class MyPoint {


    private int xCoordinate; //
    private int yCoordinate; //

    public MyPoint() {
        this(0,0);

    }

    public MyPoint(int x, int y) {

        this.xCoordinate = x;
        this.yCoordinate = y;


    }

    public int getXCoordinate() {

        return this.xCoordinate;

    }

    public int setXCoordinate(int xset) {

        return this.xCoordinate = xset;
    }

    public int getYCoordinate() {

        return this.yCoordinate;

    }

    public int setYCoordinate(int yset) {

        return this.yCoordinate = yset;
    }

    public MyPoint setXY(int xx, int yy) {

        this.xCoordinate = xx;
        this.yCoordinate = yy;
        // you can not return more than one value so you have to return object
        return this;// return current object
    }

     // second method you don't need return value in setter
//    public void setXY(int xx, int yy) {
//
//        this.xCoordinate = xx;
//        this.yCoordinate = yy;
//
//    }
    public double findDistance(int x,int y) {

        return Math.sqrt(Math.pow(this.xCoordinate - x, 2) +
                Math.pow(this.yCoordinate - y, 2) * 1.0);
    }
    public double findDistance(MyPoint myPoint, MyPoint another){
        return Math.sqrt(Math.pow(myPoint.xCoordinate - another.xCoordinate, 2) +
                Math.pow(myPoint.yCoordinate - another.yCoordinate, 2) * 1.0);
    }
    public double findSlope(int x, int y){
        return (this.yCoordinate - y) / (this.xCoordinate - x);
    }
    public double findSlope(MyPoint myPoint, MyPoint another){
        return (myPoint.yCoordinate - another.yCoordinate) / (myPoint.xCoordinate - another.xCoordinate);
    }

    public static void main(String[] args){
        MyPoint obj=new MyPoint(); // created object
        MyPoint obj1=obj.setXY(12,14); // call setXY function and setXY function returns a obj
        MyPoint obj2=new MyPoint(4,8); // created obj2
        MyPoint obj3=new MyPoint(4,3); // created obj3
        MyPoint obj4=new MyPoint(2,6); // created obj4
        System.out.println(obj1.xCoordinate+","+obj1.yCoordinate);  //output 12,14
        System.out.println(obj1.findDistance(4,8));//10.0
        System.out.println(obj1.findDistance(obj1,obj2));// 10.0
        System.out.println(obj3.findSlope(2,6));// -1.0
        System.out.println(obj3.findSlope(obj3,obj4));// -1.0

    }
}
