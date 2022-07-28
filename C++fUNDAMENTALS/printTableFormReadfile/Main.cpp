#include <iostream>
using namespace std;
#include <iomanip>
#include <fstream>// library for printing data in table format
// functions prototype or declaration of fuctions
void getInput(int years[],long protons[],long peroduas[]);  // function prototype
double calcAvrg(long cars[]);// function prototype
void dispAnalysis(int years[],long protons[],long peroduas[]);// function prototype
void dispOutput(int years[],long protons[],long peroduas[]);// function prototype

void getInput(int years[],long protons[],long peroduas[]){
   ifstream infile("input.txt");// read data from input.txt file
    int year;
    long proton;
    long perodua;
    int index=0;
   // read and initialize all three parallel arrays
    while (infile >> year >> proton>>perodua)
    { years[index]=year;
        protons[index]=proton;
        peroduas[index]=perodua;
        index++; 
    }
}
double calcAvrg(long cars[]){
    // calulate average of car brand sales
    int size=10;
    double totalSalesSum=0;
    for(int i=0;i<size;i++){
        totalSalesSum=totalSalesSum+cars[i];
    }
        
    return totalSalesSum/size;
}
void dispAnalysis(int years[],long protons[],long peroduas[]){
    double highestSale;
    double lowestSale;
    int minIndex;
    int maxIndex;
    string whichBrandHasHighest;
    string whichBrandHasLowest;
  // Assume first element of protons as maximum and minimum
    highestSale = protons[0];
    lowestSale = protons[0];
    minIndex=0;
    maxIndex=0;
    whichBrandHasHighest="Proton";
    whichBrandHasLowest="Proton";
    int size=10;
    for(int i=0;i<size;i++){
        // minimum find
       if(protons[i]<lowestSale){
        lowestSale=protons[i];
        minIndex=i;
        whichBrandHasLowest="Proton";
       }
       if(peroduas[i]<lowestSale){
        lowestSale=peroduas[i];
        minIndex=i;
        whichBrandHasLowest="Perodua";
       }
       // maximum find
       if(protons[i]>highestSale){
        highestSale=protons[i];
        maxIndex=i;
        whichBrandHasHighest="Proton";
       }
       if(peroduas[i]>highestSale){
        highestSale=peroduas[i];
        maxIndex=i;
        whichBrandHasHighest="Perodua";
       }

    }
    cout<<"LOWEST: "<<whichBrandHasLowest<<" "<<"("<<lowestSale<<")"<<" in year "<<years[minIndex]<<endl;
    cout<<"HIGHEST: "<<whichBrandHasHighest<<" "<<"("<<highestSale<<")"<<" in year "<<years[maxIndex]<<endl;

}
void dispOutput(int years[],long protons[],long peroduas[]){
    cout<<"Number of sales by Car Brand (2001-2010)"<<endl;
    cout<<"---------------------------------------------------------------"<<endl;
    // print data in table format set width between columns
    cout
        << left
        << setw(10)
        << "Year"
        << left
        << setw(10)
        << "Proton"
        << left
        << setw(10)
        << "Perodua"
        << left
        << setw(12)
        << "Total"
        << endl;
    cout<<"---------------------------------------------------------------"<<endl;
    long totalSale[10];
    for(int i=0;i<10;i++){
        totalSale[i]=protons[i]+peroduas[i];
        cout
            << left
            << setw(10)
            << years[i]
            << left
            << setw(10)
            << protons[i]
            << left
            << setw(10)
            << peroduas[i]
            << left
            << setw(12)
            << totalSale[i]
            << endl;
    }
    cout<<"---------------------------------------------------------------"<<endl;
    cout
        <<left
        <<setw(10)
        <<"Average"
        <<left
        <<setw(10)
        <<calcAvrg(protons)
        <<left
        <<setw(10)
        <<calcAvrg(peroduas)
        <<left
        <<setw(12)
        <<calcAvrg(totalSale)
        <<endl;
    cout<<"---------------------------------------------------------------"<<endl;
    dispAnalysis(years,protons,peroduas);
    cout<<endl;
   
}
int main(){

   int years[10];
   long protons[10];
   long peroduas[10];
   getInput(years,protons,peroduas);// call function getInput
   dispOutput(years,protons,peroduas);// call function sispOutput
    return 0;
}
