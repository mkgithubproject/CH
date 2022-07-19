#ifndef PERSONBOOKS_H
#define PERSONBOOKS_H
#include<iostream>
using namespace std;
class PersonBooks {
    // instance variables
    string name;
    string memberID;
    int numberOfBooksBought;
    float amountSpent;
public:
    PersonBooks(){
        //empty constructor
        name="";
        memberID="";
        numberOfBooksBought=0;
        amountSpent=0;
    }
    // argument type constructor
    PersonBooks(string nameOfPerson,string id,int totalBooks,float amount){
        name=nameOfPerson;
        memberID=id;
        numberOfBooksBought=totalBooks;
        amountSpent=amount;

    }
    // member functions for name
    void setName(string n){//update name of the person
         name=n;
    }
    void modifyName(string n){//modify name of the person
         if(name!=""){
            name=n;
            cout<<"Name modified successfully..."<<endl;
         }else{
            cout<<"You can not modify...First set the name"<<endl;
         }
    }
    void showName(){//show name of the person
        cout<<"Name: "<<name<<endl;
    }
        // member functions for member ID
    void setID(string id){//update id of the person
         memberID=id;
    }
    void modifyID(string id){//modify id of the person
         if(id!=""){
            memberID=id;
            cout<<"ID modified successfully..."<<endl;
         }else{
            cout<<"You can not modify...First set the ID"<<endl;
         }
    }
    void showID(){//show id of the person
        cout<<"ID#: "<<memberID<<endl;
    }

        // member functions for numberOfBooksBought
    void setNumberOfBooksBought(int total){//update numberOfBooksBought of the person
         numberOfBooksBought=total;
    }
    void modifyNumberOfBooksBought(int total){//modify numberOfBooksBought of the person
         if(numberOfBooksBought!=0){
            numberOfBooksBought=total;
            cout<<"number Of Books Bought modified successfully..."<<endl;
         }else{
            cout<<"You can not modify...First set the number Of Books Bought"<<endl;
         }
    }
    void showNumberOfBooksBought(){//show numberOfBooksBought of the person
        cout<<"number Of Books Bought: "<<numberOfBooksBought<<endl;
    }

        // member functions for amountSpent
    void setAmountSpent(float am){//update amountSpent of the person
         amountSpent=am;
    }
    void modifyAmountSpent(float am){//modify amountSpent of the person
         if(amountSpent!=0){
            amountSpent=am;
            cout<<"amount Spent modified successfully..."<<endl;
         }else{
            cout<<"You can not modify...First set the amount Spent"<<endl;
         }
    }
    void showAmountSpent(){//show amountSpent of the person
        cout<<"amount Spent: "<<amountSpent<<endl;
    }



};
#endif
