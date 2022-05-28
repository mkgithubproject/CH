#include <iostream> 
#include<list>   
using namespace std;  
class Pet { 
    // Access specifier 
   public:  
    // Data Members
    string Name;
    string Owner;
    int Age;
    string Description;
    bool IsHouseTrained;
    //Parameterized Constructor
    Pet(string name,int age,string description){
        Name=name;
        Age=age;
        Description=description;
        IsHouseTrained=false;
        Owner="no one";

    }
     // Member Functions()
    string ToString(){
        string trained="";
        if(IsHouseTrained){
                trained="true";
        }else{
            trained="false";
        }
        return " Name: " + 
            Name + 
            "\n Age: "+
            to_string(Age) + 
            "\n Description: " + 
            Description +
            "\n IsHouseTrained: " + trained+
             "\n Owner: " + Owner
            ;
    }
    void SetOwner(string owner){
        Owner=owner;
    }
    void Train(){
        IsHouseTrained=true;
    }
    string getName(){
        return Name;
    }
    string getOwner(){
        return Owner;
    }
    int getAge(){
        return Age;
    }
    string getDescription(){
        return Description;
    }
    bool getIsHouseTrained(){
        return IsHouseTrained;
    }

};  
int main() {  
    Pet p1("dog",12,"bull dog, brown color,very agressive dog"); //creating an object of Pet   
    Pet p2("cow",10,"This cow gives 10 litre milk"); //creating an object of Pet   
    Pet p3("parrot",1,"Lovely parrot"); //creating an object of Pet   
    Pet p4("Cat",4,"Beautiful cat"); //creating an object of Pet   
    list<Pet>petList;
    p1.SetOwner("john");
    p1.Train();
    petList.push_back(p1);
    petList.push_back(p2);
    petList.push_back(p3);
    petList.push_back(p4);
    list<Pet>::iterator itr;
    int i=1;
     for(itr=petList.begin();itr!=petList.end();++itr){
         cout<<"\n"<<i<<"."<<endl;
          cout<<itr->ToString();
          i++;
     }
     cout<<"\nEnter owner name: ";
     string owner;
     cin>>owner;
     int flag=0;
     for(itr=petList.begin();itr!=petList.end();++itr){
             if(itr->getOwner()==owner){
                 cout<<"\n";
                 cout<<itr->ToString();
                 flag=1;
                 break;
             }
         
     }
     if(flag==0){
         cout<<"\nOwner is not present in the list.\n";
     }
    return 0;  
}  
