import java.util.*;
class ArrayListUse
{
  public ArrayList < Integer > addInts ()
  {
    ArrayList < Integer > arrli = new ArrayList < Integer > ();// create empty arrayList object
    Scanner sc = new Scanner (System.in);// scanner class object for input
    while (true)
    {
    	System.out.println ("Enter integer [enter STOP for exit]");
    	if (sc.hasNextInt ())// check given input is Integer or not if yes add it into arrayList
	    { 
	       int num = sc.nextInt ();
	       arrli.add(num);
	     }else if(sc.hasNext("STOP") || sc.hasNext("stop")){ // else check input is stop then terminate the program.
	         break;
	     }else{// else invalid integer 
	         sc.next(); // move next for further input
	         System.out.println("Invalid input...");
	     }
    }
    System.out.println("Input arraylist is like...");
    for(int num:arrli){
        // print list
        System.out.print(num+" ");
    }
    return arrli;// return list
  }
}
public class Main
{
  public static void main (String[]args)
  {
    ArrayListUse obj=new ArrayListUse();
    obj.addInts();// call function addInts
  }
}
