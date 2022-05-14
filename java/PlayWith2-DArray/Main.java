import java.util.Scanner;

public class Main {
    public static void reverseColumns(int[][] arr) {
        // here we will swap the column elements from start to end
         int mid= arr.length/2;// find mid-index of column
        for(int column=0;column<arr.length;column++){
            for(int row=0;row< mid;row++){
                // swap the column elements
                int temp=arr[row][column];
                arr[row][column]=arr[arr.length-1-row][column];
                arr[arr.length-1-row][column]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// Scanner class object for taking user input
        int n;
        System.out.println("Please put your N value ?");
        n=sc.nextInt();// take size of the 2-D array from user
        int arr[][]=new int[n][n];// declare 2-D array of size n
        // take values from user and filled the array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        reverseColumns(arr);// reverseColumn function call
        //print array after reversing column
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();// change line after printing a row
        }
    }


}
