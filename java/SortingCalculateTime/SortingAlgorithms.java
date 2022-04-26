import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            // n-1 round required
            for(int j=0;j<arr.length-1-i;j++){
                //n-1 comparision in first iterartion
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int round=0;round<arr.length-1;round++){
            int min=arr[round];
            int index=round;
            for(int j=round+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            //swap
            int temp=arr[round];
            arr[round]=min;
            arr[index]=temp;

        }
    }
    public static void insertionSort(int arr[]){
            int n=arr.length;
            for(int i=1;i<n;i++){
                int j=i-1;
                int temp=arr[i];
                while(j>=0 && arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
            }
        }
    public static void main(String[] args) {
             int arr1[]=new int[100];
            int arr2[]=new int[1000];
            int arr3[]=new int[5000];
            int arr4[]=new int[10000];
            Random rnd=new Random();
            for(int i=0;i<arr1.length;i++){
                arr1[i]=1+rnd.nextInt(100);
            }
            for(int i=0;i<arr2.length;i++){
                arr2[i]=1+rnd.nextInt(1000);
            }
            for(int i=0;i<arr3.length;i++){
                arr3[i]=1+rnd.nextInt(5000);
            }
            for(int i=0;i<arr4.length;i++){
                arr4[i]=rnd.nextInt(10000);
            }
        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("bubble sort for 100 size of array [Took (in ns)]: " + (end - start));
         start = System.nanoTime();
        selectionSort(arr1);
         end = System.nanoTime();
        System.out.println("selection sort for 100 size of array [Took (in ns)]: " + (end - start));
         start = System.nanoTime();
        insertionSort(arr1);
         end = System.nanoTime();
        System.out.println("insertion sort for 100 size of array [Took (in ns)]: " + (end - start));


         start = System.nanoTime();
        bubbleSort(arr2);
         end = System.nanoTime();
        System.out.println("bubble sort for 1000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        selectionSort(arr2);
        end = System.nanoTime();
        System.out.println("selection sort for 1000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        insertionSort(arr2);
        end = System.nanoTime();
        System.out.println("insertion sort for 1000 size of array [Took (in ns)]: " + (end - start));


         start = System.nanoTime();
        bubbleSort(arr3);
         end = System.nanoTime();
        System.out.println("bubble sort for 5000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        selectionSort(arr3);
        end = System.nanoTime();
        System.out.println("selection sort for 5000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        insertionSort(arr3);
        end = System.nanoTime();
        System.out.println("insertion sort for 5000 size of array [Took (in ns)]: " + (end - start));


         start = System.nanoTime();
        bubbleSort(arr4);
         end = System.nanoTime();
        System.out.println("bubble sort for 10000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        selectionSort(arr4);
        end = System.nanoTime();
        System.out.println("selection sort for 10000 size of array [Took (in ns)]: " + (end - start));
        start = System.nanoTime();
        insertionSort(arr4);
        end = System.nanoTime();
        System.out.println("insertion sort for 10000 size of array [Took (in ns)]: " + (end - start));
    }
}
