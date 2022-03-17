public class LinkedList {
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        public Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return head==null && tail==null;
    }

    public int size() {
        int size=0;
        Node current = head;
        while(current!=null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void insertAtHead(int data) {
        Node node = new Node(data,null);//new head points to old head
        node.next = head;
        head = node;
        if(tail==null) {
            tail = node;
        }

    }

    public void appendAtTail(int data) {
        Node node = new Node(data,null); //will be the tail;
        if(tail!=null) {
            tail.next = node;
        }
        else {//empty list
            head = node;
        }
        tail = node;

    }

    //****IMPLEMENT THIS*******//
//Look for the node in the list that contains dataBefore
//Create a new node that contains data and insert it immediately after the dataBefore node
//For example if I call insertAfter(2,7) with the list [1,2,3]
//the new list would be [1,2,7,3]
//if the dataBefore does not exist in the list, print a useful message to the console
    public void insertAfter(int dataBefore, int data) {
        Node newNode=new Node(data,null);
        Node curr=head;
        Node prev=null;
        while(curr!=null && curr.data!=dataBefore){
            curr=curr.next;
            prev=curr;
        }
        if(curr==null){
            System.out.println("There is no element present for inserting an element after a given element");
        }else{
            prev=curr.next;
            curr.next=newNode;
            newNode.next=prev;
        }


    }

    //****IMPLEMENT THIS*******//
//remove the first node that has data equal to data
//if the list is empty throw an illegal argument exception
//if the list doesn't contain a node with data == data,
//then print a useful message to the console
    public void delete(int data) throws IllegalArgumentException{
        Node curr=head;
        Node prev=null;
        if(head==null){
            throw new IllegalArgumentException();
        }
        if(head.data==data){
            head=head.next;
        }else{
            while(curr!=null && curr.data!=data){
                prev=curr;
                curr=curr.next;

            }
            if(curr==null){
                System.out.println("No such element found for deletion");
            }else{
                prev.next=curr.next;
            }
        }

    }


    public int max() {
        return maxRecurse(head);

    }


    private int maxIterate() {
        Node current = head;
        int max = Integer.MIN_VALUE;

        while(current!=null) {
            if(current.data>max) {max = current.data;}
            current = current.next;
        }
        return max;
    }

    //****IMPLEMENT THIS*******//
//Recursively find the maximum element in the list.
//Called by max()
//Feel free to add parameter(s).
    private int maxRecurse(Node head){
        int max=0;
        if(head==null){
            return max;
        }
        int smallMax=maxRecurse(head.next);
        if(head.data>smallMax){
            max=head.data;
            return max;
        }else{
            return smallMax;
        }
    }

    //****IMPLEMENT THIS*******//
//Swap two nodes in a linked list
//Don't just swap the data in the nodes, swap the actual nodes
//If either i or j don't exist in the list, print a useful message to the console
    public void swap(int i, int j) {
        Node curr1=head;
        Node prev1=null;
        Node curr2=head;
        Node prev2=null;
        // both index are same
        if(i==j || head==null){
            System.out.println("Swapping is not possible");
            return;
        }
        int k=0;
        while(curr1!=null && k<i){
            prev1=curr1;
            curr1=curr1.next;
            k++;
        }
        k=0;
        while(curr2!=null && k<j){
            prev2=curr2;
            curr2=curr2.next;
            k++;
        }
        if(curr1==null || curr2==null){
            System.out.println("Swapping is not possible");
            return;
        }
        if(prev1!=null){
            prev1.next=curr2;
        }else{
            head=curr2;
        }
        if(prev2!=null){
            prev2.next=curr1;
        }else{
            head=curr1;
        }
        Node temp=curr1.next;
        curr1.next=curr2.next;
        curr2.next=temp;



    }


    //****IMPLEMENT THIS*******//
//Reverse the linked list
//E.G. [1,2,3] -> [3,2,1]
//You can only use one while loop
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public String toString() {
        String s = "[";
        Node current=head;
        while(current!=null) {
            s = s + current.data;
            current = current.next;
            if(current!=null) {s = s+",";}
        }
        return s + "]";
    }

    //put your test code here
    public static void main(String[] args) {
        LinkedList intList = new LinkedList();
        intList.appendAtTail(2);
        intList.appendAtTail(3);
        intList.appendAtTail(5);
        intList.appendAtTail(7);
        System.out.println(intList);
        intList.insertAfter(7,9);
        System.out.println("List after inserting element 9 after 7");
        System.out.println(intList);
        intList.delete(9);
        System.out.println("List after deleting element 9");
        System.out.println(intList);
        int max=intList.max();
        System.out.println("Max is: "+max);
        intList.swap(2,3);
        System.out.println("List after swapping index 2 and 3");
        System.out.println(intList);
        intList.reverse();
        System.out.println("List after reverse");
        System.out.println(intList);


    }

}
