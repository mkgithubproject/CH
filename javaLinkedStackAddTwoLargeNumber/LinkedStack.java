public class LinkedStack implements StackInterface{
    // A linked  node
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    // constructor
    LinkedStack(){
        this.top=null;
    }
    @Override
    public void push(int digit) {
       // insert at beginning
        Node newNode=new Node(digit);
        if(top==null){
            // first node to be inserted
            top=newNode;
        }else{
            // stack has already some nodes insert new node and update top
            newNode.next=top;
            top=newNode;
        }

    }

    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty...");
            return -1;
        }else{
            // update top, top will point to  its previous node
            int data=top.data;
            top=top.next;
            return data;
        }
    }

    @Override
    public int top() {
        if(!isEmpty()){
            return top.data;
        }else{
            System.out.println("Stack is empty...");
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }
}
