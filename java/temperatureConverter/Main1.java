import java.text.*;
import java.util.*;
public class Main1
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
     System.out.println("\t\tTemperature Conversion Tables");
     System.out.println("\tTemperature\t|\tTemperature");
     System.out.println("\t (degrees)\t|\t (degrees)");
     System.out.println("\tF\tC\t|\tC\tF");
     double fahrenheit=-40;
     double celcius=-40;
     NumberFormat formatter = new DecimalFormat("#0.000");  
     while(fahrenheit<=455 && celcius<=455){
         System.out.println("\t"+formatter.format(fahrenheit)+"\t"+formatter.format(celcius(fahrenheit))+"\t|\t"+formatter.format(celcius)+"\t"+formatter.format(fahrenheit(celcius)));
         fahrenheit=fahrenheit+5;
         celcius=celcius+5;
     }
     
  }
}


