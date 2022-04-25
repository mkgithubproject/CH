import java.util.*;
public class Distance_yourname {
    public static int distanceBetween(int x1, int y1, int x2, int y2) {
        return (int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    public static void main(String[] args) {
          int x1,x2,y1,y2;
          Scanner sc=new Scanner(System.in);
          while(true){
              System.out.println("x coordinate of first point: ");
              if(sc.hasNextInt()){
                  x1=sc.nextInt();
              }else{
                  while(!sc.hasNextInt()){
                      System.out.println("Invalid input, Re-enter again.");
                      sc.next();
                  }
                  x1=sc.nextInt();
              }
              System.out.println("y coordinate of first point: ");
              if(sc.hasNextInt()){
                  y1=sc.nextInt();
              }else{
                  while(!sc.hasNextInt()){
                      System.out.println("Invalid input, Re-enter again.");
                      sc.next();
                  }
                  y1= sc.nextInt();;
              }
              System.out.println("x coordinate of second point: ");
              if(sc.hasNextInt()){
                  x2=sc.nextInt();
              }else{
                  while(!sc.hasNextInt()){
                      System.out.println("Invalid input, Re-enter again.");
                      sc.next();
                  }
                  x2= sc.nextInt();;
              }
              System.out.println("y coordinate of second point: ");
              if(sc.hasNextInt()){
                  y2=sc.nextInt();
              }else{
                  while(!sc.hasNextInt()){
                      System.out.println("Invalid input, Re-enter again.");
                      sc.next();
                  }
                  y2= sc.nextInt();;
              }
              System.out.println("Distance: "+distanceBetween(x1,y1,x2,y2));
              System.out.println("\nIf you want to continue enter anything,but to end program type 'stop': " );
              //sc.nextLine();
              String end=sc.next();
              if(end.equalsIgnoreCase("stop")){
                  System.out.println("The program has ended...");
                  break;
              }

          }
    }
}
