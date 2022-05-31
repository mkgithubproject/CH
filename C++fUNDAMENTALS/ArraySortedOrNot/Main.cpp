
#include <iostream>
using namespace std;



bool checkArraySortedIncreasing(int a[], int n)
{
	
	// Base case
	if (n == 1 || n == 0)
	{
		return true;
	}
	// recursive step
	if(a[n-1]<a[n-2]){
	    // if last element of array is smaller than its previous means array is not in increasing order
	    return false;
	}else{
	    // else recursive call
	   bool smallArray=checkArraySortedIncreasing(a,n-1); 
	   return smallArray;
	}
	
	
}
bool checkArraySortedDecreasing(int a[], int n)
{
	
	// Base case
	if (n == 1 || n == 0)
	{
		return true;
	}
	// recursive step
	if(a[n-1]>a[n-2]){
	    // if last element of array is greater than its previous means array is not in decreasing order
	    return false;
	}else{
	    // else recursive call
	   bool smallArray=checkArraySortedDecreasing(a,n-1); 
	   return smallArray;
	}
	
	
}

int checkArray(int a[], int n)
{    
	if(checkArraySortedIncreasing(a,n)){// check array is sorted in increasing order if yes return 1
	    return 1;
	}else if(checkArraySortedDecreasing(a,n)){// else if check array is sorted in decreasing order if true return -1
	    return -1;
	}else{// else array is not sorted return 0
	    return 0;
	}
}

// Driver code
int main()
{
	int arr[] = { 25,23,10,5,4 };
	int n = sizeof(arr) / sizeof(arr[0]);
	
	// Function Call
	cout<<checkArray(arr,n);
	
	return 0;
}


