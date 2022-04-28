/*Compile and run:

    open cmd

     change directory in the cmd where your file is placed.

     then type these commands:

                  javac  XC1_MissingNumber.java // for compilation

                  java XC1_MissingNumber  XC1-input.txt// run and pass argument a file name */
                  
import java.io.*;
import java.util.Scanner;

public class XC1_MissingNumber {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length<1){
            System.out.println("MISSING INPUT FILE ON CMD LINE\n");
            System.exit(0);
        }
        Scanner infile=new Scanner(new File(args[0]));
        while(infile.hasNextLine()){
            String[] tokens=infile.nextLine().split("\\s+");//split line into array of strings
            int arr[]=new int[tokens.length];
            for(int i=0;i< tokens.length;i++){
                arr[i]=Integer.parseInt(tokens[i]);//convert string to int means "7" to 7;
            }
            int missingNumber=findMissingNumber(arr);
            for(int i=0;i< tokens.length;i++){
                System.out.print(tokens[i]+" ");
            }
            System.out.print(" missing "+missingNumber);
            System.out.println();
        }
    }
    public static int findMissingNumber(int[] a) {
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // if the middle element is not on the middle index and its previous element is on thr right place ,then the missing element would be mid+1
            if(a[mid]!=mid+1 && a[mid-1]==mid){
                return mid+1;
            }
            //if mid is on the correct position means missing is on the right side then search thr right
            if(a[mid]==mid+1){
                start=mid+1;
            }
            // else missing would be left side
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
