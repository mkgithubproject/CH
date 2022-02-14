#include <iostream>
using namespace std;

void selectionSort (int arr[], int n, int index)
{ // base case if index==n-1 means array is sorted no need to call further, why n-1 why not n? because last element already sorted
  if(index==n-1){
      return;
  }
  // recursive step or small calculation
  // find min element
  int minIndex=index;
  for(int i=index+1;i<n;i++){
      if(arr[i]<arr[minIndex]){
          minIndex=i;
      }
  }
  // swap min element with at index element
  int temp=arr[minIndex];
  arr[minIndex]=arr[index];
  arr[index]=temp;
  // recursive call or recursive hypothesis
  selectionSort(arr,n,index+1);
}


int main ()
{
  int size = 20;
  int arr[size];
  // insert 20 elements inthe array, rand()%50 will generate random number between 1 and 50
  for (int i = 0; i < size; i++)
    {
      arr[i] = rand () % 50;
    }
  cout << "unsorted array is:" << endl;
  for (int i = 0; i < size; i++)
    {
      cout << arr[i] << " ";
    }
  selectionSort (arr, size, 0);
  cout<<endl<<"sorted array is: "<<endl;
  for (int i = 0; i < size; i++)
    {
      cout << arr[i] << " ";
    }

  cout << endl;
  return 0;
}
