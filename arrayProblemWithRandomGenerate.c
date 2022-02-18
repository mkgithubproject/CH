#include <stdio.h>
int NumbersOfTimes(int a[],int n){
    // function for calculating NumbersOfTimes present number in the array
    int count=0;
    for(int i=0;i<100;i++){
        if(a[i]==n){
            count++;
     
       }
    }
    return count; 
}
int LastOccurence(int a[],int n){
    // return lastIndex ocuurence of the number in the array.
    int index=-1;
    for(int i=0;i<100;i++){
        if(a[i]==n){
            index=i;
     
        }
    }
    return index;
    
}
int main()
{   int a[100];
    // initialize the array with random number from 1 to 100.
    for(int i=0;i<100;i++){
        int randomNumber = rand() % 100 + 1;
        a[i]=randomNumber;
    }
    printf("The initial set of 100 numbers is:\n");
    for(int i=0;i<100;i++){
        // change line after printing 10 numbers 
        if(i%10==0){
            printf("\n");
        }
         printf("%d ", a[i]);     
    }
    while(1){
        printf("\n\nPlease enter an number in the range from 1 to 100 :");
        int number;
        scanf("%d", &number);
        int countOccurence=NumbersOfTimes(a,number);
        printf("\n%d were found %d times in the array.", number,countOccurence);
        int indexLast=LastOccurence(a,number);
        printf("\n\nThe last occurence of %d is in a[%d].", number,indexLast);
        printf("\nPress any key to continue...");
        int key;
        scanf("%d", &key);
    }
   return 0;
}

