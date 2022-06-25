#include <iostream>
#include <fstream>
#include <sstream>
#include <iomanip>
using namespace std;
struct Things{// create structure
    string name;
    int bottledWater;
    int snackServings;
    int foodServings;
    int fruiteServings;
    int numberOfCups;
    int numberOfPlates;
    int numberOfForks;
    int numberOfSpoons;
};
int totalFoodServing(Things records[4]){// function which returns the total foodservings
    int total=0;
     for(int i=0;i<4;i++){
       total=total+records[i].foodServings;
     }
     return total;
}
int totalcups(Things records[4]){// function which returns the total cups
    int total=0;
     for(int i=0;i<4;i++){
       total=total+records[i].numberOfCups;
     }
     return total;
}
string mostWaterBottlePerson(Things records[4]){// retruns the person name having most water bottle
   int max=-1;
   string name;
   for(int i=0;i<4;i++){
       if(records[i].bottledWater>max){
        max=records[i].bottledWater;
        name=records[i].name;
       }
    }
    return name;
}
int mostWaterBottleCount(Things records[4]){// returns the most water bottle count
   int max=-1;
   for(int i=0;i<4;i++){
       if(records[i].bottledWater>max){
        max=records[i].bottledWater;
       }
    }
    return max;
}
double showWaterWeight(Things records[4]){// returns the total weight of most water bottle count
    int max=-1;
   for(int i=0;i<4;i++){
       if(records[i].bottledWater>max){
        max=records[i].bottledWater;
       }
    }
    double totalWeight=max*16.9;
    return totalWeight;
}
int main(){
    ifstream file;
    file.open("info.txt");
    if(!file.is_open())
    {
        cout<<"Unable to open the file."<<endl;
        return 0;
    }
    string line;
    struct Things records[4];
    int i=0;
    // read file data
    while(getline(file, line))
    {   stringstream linestream(line);
        string name;
        int bottledWater;
        int snackServings;
        int foodServings;
        int fruiteServings;
        int numberOfCups;
        int numberOfPlates;
        int numberOfForks;
        int numberOfSpoons;
        linestream>>name>>bottledWater>>snackServings>>foodServings>>fruiteServings>>numberOfCups
        >>numberOfPlates>>numberOfForks>>numberOfSpoons;
        struct Things obj={name,bottledWater,snackServings,foodServings,fruiteServings,numberOfCups,
        numberOfPlates,numberOfForks,numberOfSpoons};// create object of struct
        records[i]=obj;// add into array
        i++;  
    }
    // show data
    file.close();
    cout<<"*****************************************************************************************************************"<<endl;
    cout<<"Friends Potluck Picnic Information"<<endl;
    cout<<"*****************************************************************************************************************"<<endl;
     cout
         << left
        << setw(15)
        << "Name"
        << left
        << setw(15)
        << "Bottled-Water"
        << left
        << setw(15)
        << "Snack"
        << left
        << setw(15)
        << "Food"
        << left
        << setw(15)
        << "Fruit"
        << left
        << setw(15)
        << "Cups"
        << left
        << setw(15)
        << "Plates"
        << left
        << setw(15)
        << "Forks"
        << left
        << setw(15)
        << "Spoons"
        << endl;
        cout<<"*****************************************************************************************************************************************************"<<endl;
        for(int i=0;i<4;i++){
        cout
        << left
        << setw(15)
        << records[i].name
        << left
        << setw(15)
        << records[i].bottledWater
        << left
        << setw(15)
        << records[i].snackServings
        << left
        << setw(15)
        << records[i].foodServings
        << left
        << setw(15)
        << records[i].fruiteServings
        << left
        << setw(15)
        << records[i].numberOfCups
        << left
        << setw(15)
        << records[i].numberOfPlates
        << left
        << setw(15)
        << records[i].numberOfForks
        << left
        << setw(15)
        << records[i].numberOfSpoons
        << endl;
        }
        cout<<"Total number of food servings in the picnic is: "<<totalFoodServing(records)<<endl;
        cout<<"Total cups brought to the picnic is: "<<totalcups(records)<<endl;
        cout<<mostWaterBottlePerson(records)<<" brought the most bottled water to the picnic: "<<mostWaterBottleCount(records)<<" bottles."<<endl;
        cout<<mostWaterBottleCount(records)<<" bottles weigh "<<fixed << setprecision(2) <<showWaterWeight(records)<<endl;
    return 0;
}
