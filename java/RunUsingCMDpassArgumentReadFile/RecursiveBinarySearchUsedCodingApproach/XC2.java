import java.io.*;
import java.util.Scanner;

public class XC2 {
    static final int INITIAL_CAPACITY=5;
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length<1){
            System.out.println("MISSING INPUT FILE ON CMD LINE\n");
            System.exit(0);
        }
        Scanner infile=new Scanner(new File(args[0]));
        int[] arr=new int[INITIAL_CAPACITY];
        int count=0;
        while(infile.hasNextInt()){
            if(count==arr.length){
                arr=upSizeArr(arr);
            }
            if(insertInorder(arr,count,infile.nextInt())){
                ++count;
            }
        }
        arr=trimArr(arr,count);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] upSizeArr(int[] fullArr) {
        int[] upSizedArr=new int[fullArr.length*2];
        for(int i=0;i< fullArr.length;i++){
            upSizedArr[i]=fullArr[i];
        }
        return upSizedArr;
    }
    public static int[] trimArr(int[] oldArr, int count) {
        int[] trimmedArr=new int[count];
        for(int i=0;i<count;i++){
            trimmedArr[i]=oldArr[i];
        }
        return trimmedArr;

    }
    private static boolean insertInorder(int[] arr, int count, int newVal) {
        int index=bSearch(arr,0,count-1,newVal);
        if(index>=0){
            return false;
        }
        index=-(index+1);
        for(int i=count-1;i>=index;--i){
            arr[i+1]=arr[i];
        }
        arr[index]=newVal;
        return true;
    }
    public static int bSearch(int[] a,int lo,int hi,int key) {
        // base case
        if(lo>hi){
            return -1;
        }
        int mid=(hi+lo)/2;
        // if a[mid] is equal to key then just return that index
        if(a[mid]==key){
            return mid;
        }else if(a[mid]>key){// else if a[mid] is greater than key then search on the left side of the array
           return bSearch(a,lo,mid-1,key);
        }else{// else search on the right side of the array
            return bSearch(a,mid+1,hi,key);
        }

    }
}
