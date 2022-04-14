public class MyLinkedList<E> extends AbstractList<E> {
    int size;
    Node head;
    Node tail;
    /**
     * A Node class that holds data and references to previous and next Nodes.
     */
    protected class Node {
        E data;
        Node next;
        Node prev;

        /**
         * Constructor to create singleton Node
         *
         * @param element Element to add, can be null
         */

        public Node(E element) {
            // Initialize the instance variables
            this.data = element;
            this.next = null;
            this.prev = null;

        }
        /**
         * Set the parameter prev as the previous node
         *
         * @param prev - new previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
        /**
         * Set the parameter next as the next node
         *
         * @param next - new next node
         */
        public void setNext(Node next) {
            this.next = next;
        }
        /**
         * Set the parameter element as the node's data
         *
         * @param element - new element
         */
        public void setElement(E element) {
            this.data = element;
        }
        /**
         * Accessor to get the next Node in the list
         *
         * @return the next node
         */
        public Node getNext() {
            return this.next;
        }
        /**
         * Accessor to get the prev Node in the list
         *
         * @return the previous node
         */
        public Node getPrev() {
            return this.prev;
        }
        /**
         * Accessor to get the Nodes Element
         *
         * @return this node's data
         */
        public E getElement() {
            return this.data;

        }

    }
// Implementation of the MyLinkedList Class

    /**
     * Only 0-argument constructor is defined
     */

    public MyLinkedList() {
       size=0;
       head=null;
       tail=null;
    }
    @Override

    public int size() {
// need to implement the size method
        return size; // TODO
    }
    @Override
    public E get(int index) {
        if(index<0 || index>=size || size==0){
            throw new IndexOutOfBoundsException("Your index is out of the list bounds");
        }
        return getNth(index).data;
    }
    @Override
    public void add(int index, E data) {
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException ("Your index is out of the list bounds");
        }
        if(data==null){
            throw new NullPointerException ("You can not add null data to the list");
        }
        int i=0;
        Node temp=head;
        Node node=new Node(data);
        if(head==null && index==0){
            head=node;
            tail=node;
            size++;
        }else if(head!=null && index==size){
            tail.next=node;
            tail=node;
            size++;
        }else{
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }
    public boolean add(E data) {
        if(data==null){
            throw new NullPointerException("You can not add null data to the list");
        }
        Node node=new Node(data);
        if(head==null){
            tail=node;
            head=node;
            size++;
        }else{
            tail.next=node;
            tail=node;
            size++;
        }
        return true;
    }
    public E set(int index, E data) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException ("Your index is out of the list bounds");
        }
        if(data==null){
            throw new NullPointerException ("You can not add null data to the list");
        }
        int i=0;
        Node temp=head;
        E prevData;
        if(index==0){
            prevData=head.data;
            head.data=data;

        }else if(head!=null && index==size-1){
            prevData=tail.data;
            tail.data=data;
        }else{
            while(i<index){
                temp=temp.next;
                i++;
            }
            prevData=temp.data;
            temp.data=data;

        }
        return prevData;
    }
    public E remove(int index) {
        if(index<0 || index>=size || size==0){
            throw new IndexOutOfBoundsException ("Your index is out of the list bounds");
        }
        E nodeData ;
        if(index==size-1){
            int i=0;
            Node temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            nodeData=  temp.next.data;
            temp.next=null;
            tail=temp;
            size--;
        }else if(size==1 && index==0){
            nodeData=head.data;
            head=null;
            tail=null;
            size--;
        }else if(size>1 && index==0){
            nodeData=head.data;
            head=head.next;
            size--;
        }else{
            int i=0;
            Node temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            nodeData=  temp.next.data;
            temp.next=temp.next.next;
            size--;

        }

        return nodeData;
    }
    public void clear() {
       head=null;
       tail=null;
       size=0;
    }
    public boolean isEmpty() {
        return size==0; // TODO
    }
    protected Node getNth(int index) {
        if(index<0 || index>=size || size==0){
            throw new IndexOutOfBoundsException("Your index is out of the list bounds");
        }
        Node nodeData ;
        if(index==size-1){
            int i=0;
            Node temp=head;
            while(i<index){
                temp=temp.next;
                i++;
            }
            nodeData=  temp;
        }else if( index==0){
            nodeData=head;
        }else{
            int i=0;
            Node temp=head;
            while(i<index){
                temp=temp.next;
                i++;
            }
            nodeData=temp;

        }

        return nodeData;
    }
}

