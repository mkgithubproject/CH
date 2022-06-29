#include <iostream>
#include <iomanip>
using namespace std;
// function to convert 
// in km/hr to m/sec
void kmh_to_msec(double &kmph)
{   //1 km/hr = 5/18 m/sec or 0.277778 m/sec 
    kmph=kmph*0.277778;// we have recieved ref of kmph variable now we can change the value of that variable here
}
 
// function to convert 
// in m/sec to km/hr
void msec_to_kmh(double &mps)
{  // 1 m/sec = 18/5 km/hr or 3.6 km/hr
    mps=3.6 * mps;
}
int main()
{
    while(1){
        cout<<"\nEnter m/s or km/h and leaves 0 for the other, both 0 to exit."<<endl;
        cout<<"Enter m/s: ";
        double first;
        cin>>first;// read first value
        cout<<"Enter km/h: ";
        double second;
        cin>>second;// read second value
        if(first==0 && second==0){
            break;// terminate loop if both are 0
        }else if(first!=0 && second!=0){// if user entered both value means none is zero
            cout<<"Please enter either km/h or m/s.";
        }else if(first!=0){
            double temp=first;// take old value of first in temp variable because it will get change after calling the function
            msec_to_kmh(first);// call function
            cout<<temp<<" m/s = "<<fixed<<setprecision(2) <<first<<" km/h.";//fixed<<setprecision(2) printing double value till 2 decimal place
        }else{
            double temp=second;
            kmh_to_msec(second);// call the function
            cout<<temp<<" km/h = "<<fixed<<setprecision(2)<<second<<" m/s.";
        }
        cout<<endl;
    }

    return 0;
}
