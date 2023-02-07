

public class LinkedList<T> {
    Node<T> head; //will point to the first node of the ll
    Node<T>tail;// will point to the last node of the ll
    public LinkedList( ) {// default constructor
        head=null;
        tail=null;
    }

    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return head==null; // if head is null return true else return false
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty( )
    {
        head=null;// head will point to the null
    }


    /**
     * Insert at the front
     * @param x the item to insert.
     */
    public void insertFront( T x ) {
        //create Node
        Node<T>newNode=new Node<>(x);
        // check list is empty or not
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{// if list is not empty
           newNode.setNextNode(head);
           head=newNode;
        }

    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public Node<T> find( T x ) {
        if(head==null){
            return null;
        }
        Node<T>temp=head;
        while (temp!=null){
            if(temp.getItem().equals(x)){
                return temp;
            }
        }
        return null;
    }

    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    public void remove( T x ) {

        Node<T>curr=head;
        Node<T>prev=null;
        if(head==null){ // if list is empty
            return;
        }
        if(head.getItem().equals(x)){
            head=head.getNextNode();
        }else{
            while(curr!=null && !curr.getItem().equals(x)){
                prev=curr;
                curr=curr.getNextNode();

            }
            if(curr==null){
                System.out.println("No such element found for deletion");
            }else{
                prev.setNextNode(curr.getNextNode());
            }
        }

    }

    /**
     * Return a string representation of the list
     */
    @Override
    public String toString() {
        Node<T>temp=head;
        String str="";
        while (temp!=null){
            str=str+temp.getItem()+" ";
            temp=temp.getNextNode();
        }
        return str;

    }


    /**
     * Return the size of the list
     * @return
     */
    public static <T> int listSize( LinkedList<T> theList ) {
        int size=0;
        Node<T>firstNode=theList.head;
        while (firstNode!=null){
            size++;
            firstNode=firstNode.getNextNode();
        }
        return size;
    }






//Methods for the Chapter 17 Programming assignment
    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd( T x ) {
        Node<T>newNode=new Node<>(x);
        if(head==null){// if list is empty
            head=newNode;
            tail=newNode;
        }else{ // if list is not empty
            tail.setNextNode(newNode);
            tail=newNode;

        }
    }


    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */
    public void removeLast(T x) {
         if(head==null){
             return;
         }
         Node<T>current=head;
         Node<T>nodeHaveLastOccurrence=null;
         while (current!=null){
             if(current.getItem().equals(x)){
                 nodeHaveLastOccurrence=current;
             }
             current=current.getNextNode();
         }
         if(nodeHaveLastOccurrence==null){
             return;
         }
        Node<T>prev=head;
         while (prev.getNextNode()!=nodeHaveLastOccurrence){
             prev=prev.getNextNode();
         }
         prev.setNextNode(nodeHaveLastOccurrence.getNextNode());
         // if last node will be deleted update tail as well
         if(nodeHaveLastOccurrence==tail){
             tail=prev;
         }
    }

    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */
    public void removeAll(T x) {
         int countOccurrence=0;
         Node<T>temp=head;
         while (temp!=null){ // find total occurrence of given number x
             if(temp.getItem().equals(x)){
                 countOccurrence++;
             }
             temp=temp.getNextNode();
         }
         // call x time remove function
        for(int i=1;i<=countOccurrence;i++){
            remove(x);
        }

    }

    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the first item in the list.
     *
     */
    public Node<T> previous(T x) {
        if(head==null){
            return null;
        }
        Node<T>current=head;
        Node<T>prev=null;
        while (current!=null && !current.getItem().equals(x)){
            prev=current;
            current=current.getNextNode();
        }
        return prev;
    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     *
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
    public Node<T> findAndMoveToFront(T x) {
        if(head==null){
            return null;
        }
        Node<T>temp=head;
        while (temp!=null){
            if(temp.getItem().equals(x)){
                remove(x);
                insertFront(x);
                break;
            }
            temp= temp.getNextNode();
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.insertFront(5);
        ll.insertFront(8);
        ll.insertEnd(15);
        System.out.println(ll.isEmpty());
        //ll.makeEmpty();
        //ll.remove(10);
        System.out.println(listSize(ll));
       // System.out.println(ll.find(8));
        //ll.removeAll(5);
        //System.out.println(ll.previous(5));
       // ll.removeLast(5);
        //System.out.println(ll.findAndMoveToFront(8));
        System.out.println(ll.toString());
    }
}
