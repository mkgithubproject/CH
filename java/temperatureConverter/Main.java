import java.util.*;
public class Main
{
  public static double celcius (double fahrenheit)
  {
    return (5.0 * (fahrenheit - 32)) / 9.0;
  }
  public static double fahrenheit (double celcius)
  {  
    return (celcius * 9.0/5.0) + 32;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.
      println ("Press 1 .Celcius CONVERSION AND 2.fahrenheit ConVersION");
    int choice = sc.nextInt ();
    if (choice == 1)
      {
	System.out.println ("Enter temp. in fahrenheit");
	System.out.println ("Temp. IN Celcius IS: " +
			    celcius (sc.nextDouble ()));
      }
    else if (choice == 2)
      {
	System.out.println ("Enter temp. in Celcius");
	System.out.println ("Temp. IN fahrenheit IS: " +
			    fahrenheit (sc.nextDouble ()));
      }
    else
      {
	System.out.println ("Invalid choice...");
      }
  }
}

