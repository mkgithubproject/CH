#include <iostream>
using namespace std;
class myClass{
    public:
      void setX(int a){
        x=a;
       }
      void printX(){
          cout<<x;
      }
      static void printCount(){
          cout<<count;
      }
      static void incrementCount(){
          count++;
      }
      myClass(int a=0){
          x=a;
      }
      
    private:
      int x;
      static int count;
};
// Initialize static member of class myClass
int myClass::count = 0;

int main()
{
    myClass obj;// statement a.
    obj.incrementCount();//statement b
    //or
    //myClass::incrementCount();// or statement b
    obj.printCount();// output 1 , statement c
    // statement d already defined all the function in the class
    myClass myObject1;// statement e 
    myObject1.setX(5);// statement e 
    myClass myObject2;// statement f 
    myObject2.setX(7);// statement f 
    // statement g
    cout<<endl;
    myObject1.printCount();// valid output would be 1 
    cout<<endl;
    myObject1.printX();// valid output would be 5 
    cout<<endl;
    //myClass.printX();// invalid printX() function is not static as well as for calling static function the syntax would be like myClass::staticFun();
    //myClass::count++;// invalid count variable is private , cant be access outside the class.
    // statement h 
    myObject1.printX();//output would be 5
    cout<<endl;
    myObject1.incrementCount();//increment count from 1 to 2
    myClass::incrementCount();// increment count from 2 to 3 ,Note static variable belongs to class not for myObject
    myObject1.printCount();// output 3 
    cout<<endl;
    myObject2.printCount();//output 3 
    cout<<endl;
    myObject2.printX();// output 7 
    cout<<endl;
    myObject1.setX(14);// x=14 
    myObject1.incrementCount();// increment count from 3 to 4
    myObject1.printX();//output 14 
    cout<<endl;
    myObject1.printCount();// output 4
    cout<<endl;
    myObject2.printCount();// output would be 4 
    cout<<endl;
    return 0;
}
