public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        // all functions in this class assume using dummy node
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        if(list==null){
            return;
        }
        ListNode temp=list.head; // pointing to head of given list
        while(temp!=null){ // iterate till temp is not null
            ListNode newNode=new ListNode(temp.val);
            if(head==null){ // if list is empty
                head=newNode; // initialized head
            }else{ // if list is not empty
                ListNode temp2=head; // pointing to head of current new list
                while (temp2.next!=null){ // find out last node of list
                    temp2=temp2.next;
                }
                temp2.next=newNode; // link newNode at last
            }
            temp=temp.next; // increment temp
            size++; // increment size

        }

    }

    public int removeAllOf(int valueToRemove) {
        int count=0;
        if(head==null){
            return 0;
        }

        // taken two variable current and prev(previous)
        ListNode current = head;
        ListNode prev = null;

        // first node has the valueToRemove
        while (current != null && current.val == valueToRemove)
        {
            head = current.next; // change head
            current = head; // change current
            count++; // increment count value
        }
        // if valueToRemove is present other than first node
        while (current != null)
        {
            // Search for the valueToRemove
            // keep track for prev because if I found same node having valueToRemove
            // and current is pointing that node then I will do just prev.next=current.next( current node will be deleted)
            while (current != null && current.val != valueToRemove)
            {
                prev = current;
                current = current.next;
            }
            // If valueToRemove is found
            if (current != null){
                // remove current node
                prev.next = current.next;
                size--; // decrement size
                count++;
            }
            // update current for next iteration of outer loop
            current = prev.next;
        }
        return count;
    }
    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // need three pointer for reversing list
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev; // update head
    }

    public SingleLinkedList(int[] dataArray) {
        if (dataArray == null) {
            return;
        }
        for(int val:dataArray){
            ListNode newNode=new ListNode(val);
            if(head==null){
                head=newNode;
            }else{
                ListNode temp2=head;
                while (temp2.next!=null){
                    temp2=temp2.next;
                }
                temp2.next=newNode;
            }
            size++;
        }
    }

    public void add(int val) {
        if(head==null){ // if list is empty
            head=new ListNode(val); // just update head
        }else { // if list is not empty
            ListNode ptr = head;
            while (ptr.next != null) { // find out last node
                ptr = ptr.next;
            }
            ptr.next = new ListNode(val); // link newNode to last node
        }
        size++;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end" : " -> ");
            ptr = ptr.next;
        }
        builder.append(String.format(", size=%d", size));
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,5};
        SingleLinkedList list=new SingleLinkedList(arr);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        list.removeAllOf(2);
        System.out.println(list);
        SingleLinkedList list1=new SingleLinkedList(list);
        System.out.println(list1);


    }
}
