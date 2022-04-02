//Split an array into two equal Sum subarrays
// recursive
public class Main
{   public static boolean sliceArray(int arr[])
    {   int leftSum=0;
        int rightSum=0;
        int index=0;
        return sliceArray_R(arr,index);//helper function 
    }
    public static boolean sliceArray_R(int[]arr,int index){
           // base case
          if(index==arr.length){
              return false;
          }
          // start index
          int leftSum=sum_R(arr,0,index);
          int rightSum=sum_R(arr,index+1,arr.length-1);
          if(leftSum==rightSum){
              return true;
          }
          // recursive call
          return sliceArray_R(arr,index+1);
    }
    // helper recursive function for calculate sum of array at given range....
    public static int sum_R(int arr[],int start,int end){
        // base case
        if(start>end){
            return 0;
        }
        // recursive call
        return arr[start]+sum_R(arr,start+1,end);
    }
    
	public static void main(String[] args) {
	    int arr1[]={2,2};
	    int arr2[]={2,3};
	    int	arr3[]={5,2,3};
		System.out.println(sliceArray(arr1));
		System.out.println(sliceArray(arr2));
	
		System.out.println(sliceArray(arr3));
	}
}
