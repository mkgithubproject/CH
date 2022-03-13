public class Point {
    // instance varibale
    private int x;
    private  int y;
    // default constructor
    Point(){
        this.x=0;
        this.y=0;
    }
    // argumented constructor
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
   // setter which sets the value of point of x
    public void setX(int x) {
        this.x = x;
    }
 // setter for y
    public void setY(int y) {
        this.y = y;
    }
  // getter which returns the value of y of point
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point: "+x +
                "," + y;
    }
    // copy constructor
    Point(Point pt){
        this.x=pt.x;
        this.y=pt.y;
    }
}
