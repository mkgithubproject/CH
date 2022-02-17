#include <iostream>
#include <time.h>
using namespace std;
// function for checking number is prime or not.
bool checkisPrime(int random){
    // if number is divisible by from 2 to number-1 then it is not prime return false
    for(int i=2;i<=random-1;i++){
        if(random%i==0){
            return false;
        }
    }
    return true;
}
int main()
{
    int number;
    cout<<"Enter a positive value of n: ";
    cin>>number;
    // Use current time as 
    // seed for random generator
    srand(time(0));
    int countPrime=0;
    while(true){
    for(int i=0;i<number;i++){
        // generate random number
        int randomNum = (rand() %
           (90 - 11 + 1)) + 11;
           // call checkisPrime function for check is prime or not
        if(checkisPrime(randomNum)){
            // if is prime , increment countPrime
            countPrime++;
        }
        cout<<"The generated random number is "<<randomNum<<" Non-trivial positive divisors= ";
        bool isTrivial=false;
        // find all non-trivial positive divisors
        for(int i=2;i<=randomNum-1;i++){
            if(randomNum%i==0){
                isTrivial=true;
                cout<<i<<" ";
            }
        }
        if(isTrivial==false){
            cout<<"NONE";
        }
        cout<<endl;
    }
    cout<<"There were "<<countPrime<<" prime numbers among the generated random numbers.";
    cout<<endl<<"Press any key to continue.....";
    char key;
    cin>>key;
    }
    return 0;
}

