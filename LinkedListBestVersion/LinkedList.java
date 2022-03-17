public class LinkedList <T> implements List<T>{
    // instance variable
    private Node<T> head;
    private Node<T>tail;
    private int size=0;
  // default constructor
    public LinkedList() {
        this.head = null;
        this.tail=null;

    }
   // getter
    public Node<T> getHead() {
        return head;
    }
 // getters
    public Node<T> getTail() {
        return tail;
    }


    @Override
    public void addAtIndex(T data, int index) {

        if(index<0 || index>size){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        if(data==null){
            throw new IllegalArgumentException("You can not add null data to the list");

        }
        int i=0;
        Node<T> temp=head;
        Node<T>node=new Node<T>(data);
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

    @Override
    public T getAtIndex(int index) {
        if(index<0 || index>=size || size==0){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
            int i=0;
            Node<T>temp=head;
            while(i<index){
                temp=temp.next;
                i++;
            }
        return temp.data;
    }

    @Override
    public T removeAtIndex(int index) {
        if(index<0 || index>=size || size==0){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        T nodeData ;
        if(index==size-1){
            int i=0;
            Node<T>temp=head;
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
            Node<T>temp=head;
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

    @Override
    public T remove(T data) {
        if(data==null){
            throw new IllegalArgumentException("You can not remove null data from the list");

        }
        int i=0;
        Node<T>temp=head;
        Node<T>prev=null;
        T removedData=null;
        if(head.data.equals(data)){
             removedData= head.data;
            head=head.next;
            size--;
        }else{
            while(i<size){

                if(temp.data.equals(data)){
                    System.out.println(temp.data);
                    prev.next=temp.next;
                    size--;
                    removedData= temp.data;
                    break;
                }else{
                    prev=temp;
                    temp=temp.next;
                    i++;
                }
            }
            if(i>size){
                throw new IllegalArgumentException("The data is not present in the list");
            }
        }

        return removedData;
    }

    @Override
    public void clear() {
        head=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
}
