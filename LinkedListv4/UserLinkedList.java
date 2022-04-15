public class UserLinkedList {
    private  UserNode head;
    private UserNode tail;
    private int size=0;
    //default constructor
    public UserLinkedList() {
        this.head = null;
        this.tail = null;
    }
    // add node at the last
    public void addLast(User a){
        UserNode node=new UserNode(a);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    // add node at the first
    public void addFirst(User a){
        UserNode node=new UserNode(a);
        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }
    // add node a given index
    public void addAt(User a,int index){
        if(index<0 || index>size){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        if(a==null){
            throw new IllegalArgumentException("You can not add null data to the list");

        }
        int i=0;
        UserNode temp=head;
        UserNode node=new UserNode(a);
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
  // return a reference of a given index node
    public UserNode getReferenceAt(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        int i=0;
        UserNode temp=head;
        while(i<=index){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    // remove node at a given index
    public void remove(int index){
        if(index<0 || index>=size || size==0){
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        if(index==size-1){
            int i=0;
            UserNode temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            temp.next=null;
            tail=temp;
            size--;
        }else if(size==1 && index==0){
            head=null;
            tail=null;
            size--;
        }else if(size>1 && index==0){
            head=head.next;
            size--;
        }else{
            int i=0;
            UserNode temp=head;
            while(i<index-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    // print list data
    public void printList(){
        UserNode temp=head;
        while(temp!=null){
            System.out.println(temp.data.userId+" "+temp.data.userName+" "+temp.data.userAge);
            temp=temp.next;
        }
    }
}
