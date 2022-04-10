public class Main
{   
public  void reverseArray(int[] myArray){
    // helper function
    reverseArrayHelper(myArray,0,myArray.length-1);
}
public  void reverseArrayHelper(int[] myArray,int start,int end){
    // base case
      if(start>=end){
          return;
      }
      // swap first and last element
      int temp=myArray[end];
      myArray[end]=myArray[start];
      myArray[start]=temp;
      // recursive call
      reverseArrayHelper(myArray,start+1,end-1);
}
	public static void main(String[] args) {
	    int arr[]={2,3,4,5,7,8};
	    Main obj=new Main();
	    obj.reverseArray(arr);
	    System.out.println("After reversing.....");
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
