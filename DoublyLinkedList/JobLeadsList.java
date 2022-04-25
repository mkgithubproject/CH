package DoublyLinkedList;

public class JobLeadsList {
    // instance variable
    private Node head;
    private Node tail;
   // constructor
    public JobLeadsList() {
        this.head = null;
        this.tail = null;
    }
    // add_to_front method defined
    public void add_to_front(String companyName,String contactFullName,String phone,String title,String desc){
        JobLead jobLead=new JobLead(companyName,contactFullName,phone,title,desc);
        Node newNode=new Node();
        newNode.lead=jobLead;
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        System.out.println("The addition was successful");
    }
    //add_to_tail method defined
    public void add_to_tail(String companyName,String contactFullName,String phone,String title,String desc){
        JobLead jobLead=new JobLead(companyName,contactFullName,phone,title,desc);
        Node newNode=new Node();
        newNode.lead=jobLead;
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        System.out.println("The addition was successful");
    }
    // remove_lead method defined
    public void remove_lead(String companyName,String job_title){
        if(head==null){
            System.out.println("List is empty you can not remove lead");
        }
        else {
            Node temp=head;
            int flag=0;
            while(temp!=null){
                if(temp.lead.getCompanyFullName().equals(companyName) && temp.lead.getTitle().equals(job_title)){
                    flag=1;
                    if(temp==head && tail==temp){
                        // delete first node
                        // list has only one node
                        head=null;
                        tail=null;
                        break;
                    }else if(temp==head && tail!=temp){
                        head=head.next;
                        head.prev=null;
                        break;
                    }else if(temp==tail){
                        // delete last node
                        tail=tail.prev;
                        tail.next=null;
                        break;
                    }else{
                        // delete node in between to the  list
                        temp.prev.next=temp.next;
                        temp.next.prev=temp.prev;
                        break;
                    }
                }
                temp=temp.next;
            }
            if(flag==0){
                System.out.println("Lead is not found in the list");
            }else{
                System.out.println("Remove lead is successful");
            }
        }
    }
    //print_head_to_tail method defined
    public void print_head_to_tail(){
        if(head==null){
            System.out.println("List is empty");
        }else {
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.lead.toString());
                temp=temp.next;
            }
        }
    }
    //print_tail_to_head method defined
    public void print_tail_to_head(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp=tail;
            while(temp!=null){
                System.out.println(temp.lead.toString());
                temp=temp.prev;
            }
        }
    }
}
