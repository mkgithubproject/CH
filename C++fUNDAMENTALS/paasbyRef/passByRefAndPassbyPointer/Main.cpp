#include <iostream>
using namespace std;
void bubbleSortPaasByPointer(int *arr,int n){// pass by pointer
    // sort
    // outer loop will execute n-1 times because last element will be already in correct position
    for(int i=0;i<n-1;i++){
        //inner loop will ecute n-i-1 because last element will be in correct position
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){// if jth index element is greater than its next swap then
                // swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
void bubbleSortPaasByReference(int (&arr)[10],int n){// pass by pointer
    // sort
    // outer loop will execute n-1 times because last element will be already in correct position
    for(int i=0;i<n-1;i++){
        //inner loop will ecute n-i-1 because last element will be in correct position
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){// if jth index element is greater than its next swap then
                // swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main()
{
    int arr[]={4,6,12,9,23,45,2,5,3,8};
    //bubbleSortPaasByPointer(arr,10);// pass by pointer
    bubbleSortPaasByReference(arr,10);// pass by reference
    // display array
    for(int i=0;i<10;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
