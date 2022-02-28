import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter your height in feet: ");
		double feetHeight=sc.nextDouble();
		System.out.print("Enter your height in inches: ");
		double inchesHeight=sc.nextDouble();
		System.out.print("Enter your weight in kilogram: ");
		double weight=sc.nextDouble();
		double meterHeight=((feetHeight*30.48)+(inchesHeight*2.54))/100;
		double bmi=weight/(meterHeight*meterHeight);
		System.out.println("Your Body Mass Index is  "+String.format("%.2f", bmi));
	}
}
