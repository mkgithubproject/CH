#include <bits/stdc++.h>
using namespace std;
//O(n)
int sumOfMultiplesOn(int n,int a,int b){
    int multipleSum=0;
    for(int i=1;i<n;i++){
        if(i%a==0 || i%b==0){
            multipleSum=multipleSum+i;
        }
    }
    return multipleSum;
    
}
//O(1)
int sumOfMultiplesO1(int n,int a,int b)
{    
    // multiples of a ,b strictly  less than N so n--
    n--;
    // Number of  multiples of a
    int m1 = n / a;
    // Number of  multiples of b
   int m2=n/b;
    // sum of first m1 natural numbers
    int sum1 = m1 * (m1 + 1) / 2;
 // sum of first m2 natural numbers
    int sum2 = m2 * (m2 + 1) / 2;
    //there might be some common multiples so remove the duplicates
     // common factors of A and B
    int common = (a * b) / __gcd(a, b);
    int m3=n/common;
    int sum3=m3 * (m3 + 1) / 2;
    // sum of multiples
    int ans = (a * sum1)+(b*sum2)-(common*sum3);
 
    return ans;
}
int main()
{  int a,b,n;
    
    cin>>n>>a>>b;
    cout<<sumOfMultiplesO1(n,a,b);

    return 0;
}
