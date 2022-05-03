import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int arr[][]=new int[5][5];// declare 2 d array
        //create random object
        Random random= new Random();
        int min=10;
        int max=75;
        // fill array
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int randomNumber = (int)(Math.random() * ((max - min) + 1));// generate random array
                arr[i][j]=randomNumber;
            }
        }
        // print array
        System.out.println("Output the array elements.");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // sum of prime number
        System.out.println("Output the sum of prime number in the array.");
        int primeTotal=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(isPrime(arr[i][j])){
                    primeTotal+=arr[i][j];
                }
            }
        }
        System.out.println(primeTotal);
        // print main diagonal
        System.out.println("Output the elements in the main diagonal.");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        // calculate sum Below Diagonal
        System.out.println("Output the sum of the elements below the diagonal.");
        int sumBelowDiagonal=0;
        for (int i = 1; i < 5; i++) {
            for (int j=i-1 ; j>=0 ; j--) {
                sumBelowDiagonal= sumBelowDiagonal + arr[i][j];
            }
        }
        System.out.println(sumBelowDiagonal);
        // calculate sum above Diagonal
        System.out.println("Output the sum of the elements above diagonal.");
        int sumAboveDiagonal=0;
        for (int j = 1; j < 5; j++) {
            for (int i=j-1 ; i>=0 ; i--) {
                sumAboveDiagonal= sumAboveDiagonal+ arr[i][j];
            }
        }
        System.out.println(sumAboveDiagonal);
        // find odd numbers Below Diagonal
        System.out.println("Output the odd numbers below the diagonal.");
        for (int i = 1; i < 5; i++) {
            for (int j=i-1 ; j>=0 ; j--) {
                if(arr[i][j]%2!=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        // find even numbers above Diagonal
        System.out.println("Output the even numbers above the diagonal.");
        for (int j = 1; j < 5; j++) {
            for (int i=j-1 ; i>=0 ; i--) {
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    private static boolean isPrime(int num) {
         // check number is prime or not
        for(int i=2;i<num;i++ ){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
