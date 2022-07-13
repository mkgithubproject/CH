/* Enter size of the array: 13
Enter 13 numbers
3 4 9 33 4 7 9 8 5 4 3 4 15
the longest monotonic increasing sequence: 
3 4 9 33 
the longest monotonic decreasing sequence: 
9 8 5 4 3 
Process finished with exit code 0  */
import java.util.Scanner;

public class MonoTonic {
    // instance variable
    private int n;
    private int arr[];
  // default constructor
    public MonoTonic() {
        n=0;
        arr=new int[n];
    }
    public void read(){
        // read size and elements of the array
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        n=sc.nextInt();// read size
        arr=new int[n];// initialize array of size n
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();// read value for array
        }
    }
    public void increasing(){
        int start=0;
        int end=0;
        int count=-1;
        int incrementIndexStart=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                incrementIndexStart=i;
                int tempCount=1;
                while(i<n-1 && arr[i+1]>arr[i]){// count till next element is greater
                    tempCount++;
                    i++;
                }
                if(tempCount>count){// if tempCount>count means new sequence is longest ,update start and end indexes as well as count value
                    start=incrementIndexStart;
                    end=i;
                    count=tempCount;
                }
            }
        }
        System.out.println("the longest monotonic increasing sequence: ");
        for(int i=start;i<=end;i++){// print longest monotonic
            System.out.print(arr[i]+" ");
        }

    }
    public void decreasing(){
        int start=0;
        int end=0;
        int count=-1;
        int decrementIndexStart=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                decrementIndexStart=i;
                int tempCount=1;
                while(i<n-1 && arr[i+1]<arr[i]){// count till next element is smaller
                    tempCount++;
                    i++;
                }
                if(tempCount>count){// if tempCount>count means new sequence is longest ,update start and end indexes as well as count value
                    start=decrementIndexStart;
                    end=i;
                    count=tempCount;
                }
            }
    }
        System.out.println("\nthe longest monotonic decreasing sequence: ");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        MonoTonic mono=new MonoTonic();
        mono.read();
        mono.increasing();
        mono.decreasing();
    }
}

