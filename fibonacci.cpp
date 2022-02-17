#include <iostream>

using namespace std;

int main()
{   // declare variables
    int first,second,numberOfTerms;
    cout<<"Enter the first 2 terms and the number of terms to be generated: ";
    cin>>first>>second>>numberOfTerms;
    // display first and second
    cout<<first<<" "<<second<<" ";
    for(int i=1;i<=numberOfTerms-2;i++){
        // calculate third by sum of first +second
        int third=first+second;
        // display third
        cout<<third<<" ";
        // swap first with second and second with third
        first=second;
        second=third;
    }
    return 0;
}
