#include<iostream>
using namespace std;
void print(int list[],int size){
    cout<<"Numbers: ";
    for (int i = 0; i < size; i++)
    {
        cout<<list[i]<<" ";
    }
    cout<<endl;
    
}
int main(){
    int list[5]={};
    int count=0;
    int n;
    cout<<"Input 5 numbers:\n";
    for (int i = 1; i <= 5; i++)
    {
        cout<<i<<": ";
        cin>>n;
        count++;
        if (count==1)
        {   // if count ==1 means first element need to add in list
            list[count-1]=n;
        }else if(n>list[count-2]){
            //add at last
            list[count-1]=n;
        }else if(n<list[0]){
            // add at first
            // move forward element and put n at index 0
           for(int i=count-1;i>=0;i--){
               list[i+1]=list[i];
           }
           list[0]=n;
        }else{
            // need to insert in between array
            for (int i = 0; i < count-1; i++)
            {
                if(list[i]>=n){
                    for(int j=count-1;j>=i;j--){
                        list[j]=list[j-1];
                    }
                    list[i]=n;
                }
            }
            
        }
        print(list,count);
        
    }
    
}
