public class Line {
    // instance variable
    private Point lineBegin;
    private Point lineEnd;
    // constructor
    Line(Point pt1,Point pt2){
       this.lineBegin= new Point(pt1);
     this.lineEnd= new Point(pt2);

    }
  // setter
    public void setLineBegin(Point lineBegin) {
        this.lineBegin = lineBegin;
    }
 //setter
    public void setLineEnd(Point lineEnd) {
        this.lineEnd = lineEnd;
    }
  //getter
    public Point getLineBegin() {
        return lineBegin;
    }
   //getter
    public Point getLineEnd() {
        return lineEnd;
    }

    @Override
    public String toString() {
        return "Line: " +
                 lineBegin +
                ", " + lineEnd
                ;
    }
}
