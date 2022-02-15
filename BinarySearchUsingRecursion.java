import java.util.*;
public class BinarySearchUsingRecursion{
    public static int binarySearch(int arr[],int l,int u,int item){
        if(l>u){
            return -1;
        }
        int mid=(u+l)/2;
        if(arr[mid]==item){
            return mid;
        }else if(item>arr[mid]){
           return  binarySearch(arr,mid+1,u,item);
        }else{
            return  binarySearch(arr,l,mid-1,item);
        }
    }
    public static void main(String args[]){
        int input[]={4, 7, 1, 3, 2, 6, 5, 8};
        Arrays.sort(input);
        // for binary binarySearch array should be sorted
        System.out.println("Sorted array is: ");
		for(int i=0;i<input.length;i++){
		    System.out.print(input[i]+" ");
		}
		System.out.println("\n"+binarySearch(input,0,input.length-1,3)); // return indedx , index of 3 is 2
		
    }
}
