#include <stdio.h>
#include <limits.h>
void update_pointer(double* arr, const int size, double threshold, double ** ptr){
    if(arr==NULL || size<0 || ptr==NULL){
        printf("Invalid input\n");
        return;
    }
    for(int i=0;i<size;i++){
        if(arr[i]>=threshold){
            double value=arr[i];
            *ptr=&value;
            ptr=&(*ptr);
        }
    }
}
int main()
{ 
    int size=5;
    double arr[]={4.5,5.0,10.8,5.0,10.7};
    double *ptr1;// declare pointer which holds the address of variable
    ptr1=NULL;// ptr1 points to null
    double **ptr;// declare double pointer which holds the address of pointer
    ptr=&ptr1;// double pointer ptr points to ptr1 means ptr has the address of ptr1
    update_pointer(arr,size,5,ptr);
    printf("Value of  double pointer = %f\n", **ptr);
    return 0;
}
