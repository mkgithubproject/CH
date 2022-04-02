public class MainWithoutRecursion
{   public static boolean sliceArray(int arr[])
    { int n=arr.length;
     
    int leftSum = 0 ;
 
    // traverse array element
    for (int i = 0; i < n; i++)
    {
        // add current element to left Sum
        leftSum += arr[i] ;
 
        // find sum of rest array
        // elements (rightSum)
        int rightSum = 0 ;
         
        for (int j = i+1 ; j < n ; j++ ){
            rightSum += arr[j] ;
        }
            
 
        // split point index
        if (leftSum == rightSum)
            return true ;
    }
 
    // if it is not possible to
    // split array into two parts
    return false;
    }  
	public static void main(String[] args) {
	    int arr1[]={2,2};
	    int arr2[]={2,3};
	    int	arr[]={5,2,3};
		System.out.println(sliceArray(arr1));
		System.out.println(sliceArray(arr2));
	
		System.out.println(sliceArray(arr));
	}
}
