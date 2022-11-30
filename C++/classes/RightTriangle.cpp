#include <iostream>
#include<cmath>
using namespace std;

class RightTriangle{
    public:
       // function declaration
       RightTriangle();
       RightTriangle(double,double);
       double get_hypotenuse();
       double get_perimeter();
       double get_area();
       void resize(double factor);
    private:
      // instance variable/ attribute
      double a,b;
};
// defined defAULT constructor
RightTriangle::RightTriangle(){
  a=1;
  b=1;
}
// defined argument type constructor
RightTriangle::RightTriangle(double x, double y){
  a=x;
  b=y;
}

// get_hypotenuse function
double RightTriangle::get_hypotenuse(){
  double c;
  c=sqrt((a*a)+ (b*b));
  return c;
}
// get_perimeter function
double RightTriangle::get_perimeter(){
  double p;
  p=a+b+get_hypotenuse(); // side a+ side b+ side c (hypotenuse)
  return p;
}

// get_area function
double RightTriangle::get_area(){
  double area;
  area=(a*b)/2;
  return area;
}

// resize function
void RightTriangle::resize(double factor){
  a=a*factor;
  b=b*factor;
}

int main(){ // main function
   cout<<"Please input the lengths of two catheti of the right triangle: ";
   double length1;
   double length2;
   cin>>length1; // read length1
   cin>>length2; // read lenght2
   cout<<"Please input the resizing factor: ";
   double fac; 
   cin>>fac;// read factor
   if(length1>0 && length2>0){ // if both lengtha are positive
      RightTriangle triangle(length1,length2); // created object of  RightTriangle class
      //call functions and print its results
      cout<<"The hypotenuse of the right triangle = "<<triangle.get_hypotenuse()<<endl;
      cout<<"The perimter of the right triangle = "<<triangle.get_perimeter()<<endl;
      cout<<"The area of the right triangle = "<<triangle.get_area()<<endl;
      triangle.resize(fac); // call resize() method
      cout<<"The hypotenuse of the right triangle after resizing = "<<triangle.get_hypotenuse()<<endl;
      cout<<"The perimter of the right triangle after resizing = "<<triangle.get_perimeter()<<endl;
      cout<<"The area of the right triangle after resizing = "<<triangle.get_area()<<endl;

   }else{
      RightTriangle triangle;
      cout<<"The hypotenuse of the right triangle = "<<triangle.get_hypotenuse()<<endl;
      cout<<"The perimter of the right triangle = "<<triangle.get_perimeter()<<endl;
      cout<<"The area of the right triangle = "<<triangle.get_area()<<endl;
      triangle.resize(fac);
      cout<<"The hypotenuse of the right triangle after resizing = "<<triangle.get_hypotenuse()<<endl;
      cout<<"The perimter of the right triangle after resizing = "<<triangle.get_perimeter()<<endl;
      cout<<"The area of the right triangle after resizing = "<<triangle.get_area()<<endl;

   }
}
