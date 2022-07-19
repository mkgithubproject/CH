#include<iostream>
using namespace std;
#include "bookBuyer.h"
int main(){
    PersonBooks p1("john","45012",2,550);
    p1.showName();
    p1.showID();
    p1.showNumberOfBooksBought();
    p1.showAmountSpent();
    
    return 0;
}
