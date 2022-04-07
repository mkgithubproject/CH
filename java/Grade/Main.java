import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER MARKS:-");
		System.out.println();
		System.out.print("\t\t\tFIRST TEST: ");
		double ft=sc.nextDouble();
		System.out.print("\t\tSECOND TEST: ");
		double st=sc.nextDouble();
		System.out.println();
		System.out.print("\tASSIGNMENT 1: ");
		double as1=sc.nextDouble();
		System.out.print("\tASSIGNMENT 2: ");
		double as2=sc.nextDouble();
		System.out.print("\tASSIGNMENT 3: ");
		double as3=sc.nextDouble();
		System.out.println();
		System.out.print("FINAL EXAMINATION: ");
		double fe=sc.nextDouble();
		System.out.println("\t\t\t\tCALCULATED MARKS\n");
		double test1Percent=(ft*20.0)/50.0;
		double test2Percent=(st*20.0)/50.0;
		double assignmentTotalPercent=((as1+as2+as3)*30.0)/90.0;
		double finalPercent=(fe*30.0)/100.0;
		double totalPercent=test1Percent+test2Percent+assignmentTotalPercent;
		char grade='';
// 		if(totalPercent>=80){
// 		    grade='A';
// 		}else if(totalPercent>=75 && totalPercent<=79){
// 		    grade='A-';
// 		}
// 		else if(totalPercent>=70 && totalPercent<=74){
// 		    grade='B+';
// 		}else if(totalPercent>=65 && totalPercent<=69){
// 		    grade='B';
// 		}else if(totalPercent>=60 && totalPercent<=){
// 		    grade='A-';
// 		}
		System.out.println("TEST1\tTEST2\t\tAS1\tAS2\tAS3\tSUB-TOTAL\tFINAL EXAM\tTOTAL\tGRADE");
		System.out.println("TEST1\tTEST2\t\tAS1\tAS2\tAS3\tSUB-TOTAL\tFINAL EXAM\tTOTAL\tGRADE");
		
	}
}
