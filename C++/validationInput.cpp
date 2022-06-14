
#include <iostream>
#include <limits>
using namespace std;
int factorial(int n){
    // function to calculate factorial of a number 
    int fact=1;
    for(int i=1;i<=n;i++){
       fact=fact*i; 
    }
    return fact;
}
int nToPowerM(int n,int m){
    // function to calculate n to power m
    int result=1;
    for(int i=1;i<=m;i++){
        result=result*n;
    }
    return result;
}
int main()
{
    while(1){
        cout<<"1. Calculate n! (n factorial)."<<endl;
        cout<<"2. Calculate n to the power of m."<<endl;
        cout<<"3. Exit program."<<endl;
        int choice;
        cin>>choice;// read choice of user
        if(choice==3){// if choice 3 terminate the program
            break;
        }
        else if(choice==1){// if choice is 1
            int n;
            bool valid=false;
            // validate input is integer type or not
            do{
                cout<<"Enter a number from 1 to 9: ";
                cin>>n;
                if(cin.good()){
                    //everything went well
                    // now check number is given range or not
                    // check n is given range or not
                    if(n>9 || n<1){
                        //something went wrong, we reset the buffer's state to good
                        cin.clear();
                        //and empty it
                        cin.ignore(numeric_limits<streamsize>::max(),'\n');
                        cout << "Invalid input, given number is not in range please re-enter..." << endl;
                    }else{
                        // else number in range and also a integer number terminate loop
                        valid=true;
                    }
                }else{
                    //something went wrong, we reset the buffer's state to good
                    cin.clear();
                    //and empty it
                    cin.ignore(numeric_limits<streamsize>::max(),'\n');
                    cout << "Invalid input please re-enter..." << endl;
                }
            }while(!valid);
            // after everything validation find out factorial of n
            cout<<"factorial of number "<<n<<" is "<<factorial(n)<<endl;
            
        }else if(choice==2){// if choice is 2
            int n;
            int m;
            bool valid=false;
            // validate input value for n is integer type or not
            do{
                cout<<"Enter a value for n from 1 to 9: ";
                cin>>n;
                if(cin.good()){
                    //everything went well
                    // now check number is given range or not
                    // check n is given range or not
                    if(n>9 || n<1){
                        //something went wrong, we reset the buffer's state to good
                        cin.clear();
                        //and empty it
                        cin.ignore(numeric_limits<streamsize>::max(),'\n');
                        cout << "Invalid input, given number is not in range please re-enter..." << endl;
                    }else{
                        // else number in range and also a integer number terminate loop
                        valid=true;
                    }
                }else{
                    //something went wrong, we reset the buffer's state to good
                    cin.clear();
                    //and empty it
                    cin.ignore(numeric_limits<streamsize>::max(),'\n');
                    cout << "Invalid input please re-enter..." << endl;
                }
            }while(!valid);

             valid=false;
            // validate input value for m is integer type or not
            do{
                cout<<"Enter a value for m from 1 to 9: ";
                cin>>m;
                if(cin.good()){
                    //everything went well
                    // now check number is given range or not
                    // check n is given range or not
                    if(n>9 || n<1){
                        //something went wrong, we reset the buffer's state to good
                        cin.clear();
                        //and empty it
                        cin.ignore(numeric_limits<streamsize>::max(),'\n');
                        cout << "Invalid input, given number is not in range please re-enter..." << endl;
                    }else{
                        // else number in range and also a integer number terminate loop
                        valid=true;
                    }
                }else{
                    //something went wrong, we reset the buffer's state to good
                    cin.clear();
                    //and empty it
                    cin.ignore(numeric_limits<streamsize>::max(),'\n');
                    cout << "Invalid input please re-enter..." << endl;
                }
            }while(!valid);
            // print n to power m
            cout<<"The "<<n<<" to the power of "<<m<<" is "<<nToPowerM(n,m)<<endl;
            
        }else{
            cout<<"Invalid choice"<<endl;
        }
    }

    return 0;
}
