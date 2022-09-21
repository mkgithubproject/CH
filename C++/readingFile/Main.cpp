#include <iostream>// reading I/O
#include <fstream>// reading text file
#include <string>// for working with string
#include <sstream>// converting string to integer/float
#include <iomanip> // std::setprecision  
using namespace std;

int main()
{  cout<<endl;
    cout << "Enter your employee number to see if you get a discount: ";
    int empNumber;
    cin >> empNumber;// read empNumber
    if(cin.fail())
    {
        cout<<"You did not enter a number! The program will now exit.";
        return 0;
    }
    if (empNumber < 10000 || empNumber > 99999)// if empNumber is not in range of 5 digit
    {
        cout << "You entered a number that is out of range! Employee numbers are 5 digits (between 10000 and 99999). Program will now exit";
        return 0;// return just
    }
    // else everything is ok now
    // read data from file
    string line;
    ifstream myfile("EOM.txt");
    bool isEmpFound=false;
    if (myfile.is_open())
    {
        while (getline(myfile, line))
        {
            //cout << line << '\n';
            int start = 0;
            string delimeter=" ";
            int end = line.find(delimeter);// find index of delimeter
            string accountInStringForm=line.substr(start, end - start);// split account number
            int accountInInteger=stoi(accountInStringForm);// convert account to integer
            float discount=stof(line.substr(end+1,line.length()));// split discount from line and convert to float
            if(accountInInteger==empNumber){// check account matches or not
                isEmpFound=true;
                cout<<"You have won a discount of "<< fixed << setprecision(2)<<100*discount<<"%."<<endl;
                cout<<"Enter the total bill: ";
                float bill;
                cin>>bill;
                if(cin.fail()){
                    cout<<"You did not enter a number! The program will now exit.";
                    return 0;
                }
                if(bill<=0){
                    cout<<"The total should be greater than 0. The program will now exit.";
                    return 0;
                }
                cout<<"Your discount will take $"<< fixed << setprecision(2)<<bill*discount<<" off your bill."<<endl;
                cout<<"Your new total is $"<< fixed << setprecision(2)<<bill- (bill*discount)<<"."<<endl;
                return 0;
            }
        }
        if(isEmpFound==false){
            cout<<"Sorry you did not win a discount this month. Try again next month.";
        }
        myfile.close();
    }

    return 0;
}
