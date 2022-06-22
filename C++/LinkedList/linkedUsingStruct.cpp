#include <iostream>
using namespace std;
struct node {// structure which has int variable and one pointer
   int val;
    node *next;
};
struct node* head = NULL;// initialize a pointer head
node* insert(int new_data) {// insert data into linked list
   struct node* new_node = (struct node*) malloc(sizeof(struct node));
   new_node->val = new_data;
   new_node->next = head;
   head = new_node;
   return head;// return head
}
int ll_sum(node* st){
    int sum=0;// initialize sum to 0 initialy
     while(st!=NULL){// iterate till st not become NULL
        sum=sum+st->val;// update sum, sum + node value
        st=st->next;// now st will point to the next node
     }
     return sum;// return sum
    
}
int main() {
   node* head;
   head= insert(5);
   head= insert(12);
   head= insert(3);
   head=insert(20);
   head=insert(10);
   cout<<ll_sum(head);
   return 0;
}
