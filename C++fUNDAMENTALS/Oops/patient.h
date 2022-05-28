#include <iostream>
#include<string>  
using namespace std;  
class Patient { 
    // Access specifier 
   private:  
    // Data Members
    char first_name[16];
    char second_name[16];
    int age;
    float weight;
    float height;
     // Member Functions()
    public:
        string display_data(){
            return "Patient name: " + 
                string(first_name)+" "+string(second_name)+ 
                "\nAge: "+
                to_string(age) + " years old"+
                "\nHeight: " + 
                to_string(height) +" m"+
                "\nWeight: " + to_string(weight)+" kg"+"\n";
        }
        void edit_data(){
            cout<<"Enter first name: ";
            cin>>first_name;
            cout<<"Enter second name: ";
            cin>>second_name;
            cout<<"Enter age: ";
            cin>>age;
            cout<<"Enter weight: ";
            cin>>weight;
            cout<<"Enter height: ";
            cin>>height;
        }
        float calculate_bmi(){
            return weight/(height*height);
        }
        void status_bmi(){
            float bmi=calculate_bmi();
            if(bmi<18.5){
                cout<<"\nYour BMI status is: underweight";
            }else if(bmi>=18.5 && bmi<25){
                cout<<"\nYour BMI status is: normal";
            }else if(bmi>=25 && bmi<30){
                cout<<"\nYour BMI status is: overweight";
            }else{
                cout<<"\nYour BMI status is: obese";
            }
        }
};  
 
