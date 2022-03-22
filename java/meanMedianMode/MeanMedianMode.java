import java.util.*;
public class MeanMedianMode {
    public static double getMean(int[] arr) {
        double totalSumForMean = 0;
        double mean;
        for (int i = 0; i < arr.length; i++){
            totalSumForMean =totalSumForMean+ arr[i];
        }
        mean=totalSumForMean/ arr.length;
        return mean;
    }
    public static double getMedian(int[] arr) {
        int[] temp = arr.clone(); // copy arr into temp array using clone methode
        Arrays.sort(temp);
        double median = 0;
        int n = temp.length;

        if (n % 2 !=0) {// check for odd case
            median = temp[n / 2]; // number of elements count is odd just return middle element
        } else {
            median = (temp[n / 2] + temp[n / 2 - 1]) / 2.0; // else return average of middle two elements
        }

        return median;
    }
    public static double getMode(int[] arr) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < arr.length; ++i) {
            int count = 0;
            for (j = 0; j < arr.length; ++j) {
                if (arr[i] == arr[j]){
                    ++count;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want to put in the array.");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" Elements of the array.");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Means is: "+getMean(arr));
        System.out.println("Median is: "+getMedian(arr));
        System.out.println("Mode is: "+getMode(arr));
    }


}
