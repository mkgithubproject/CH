package DoublyLinkedList;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        JobLeadsList joblist=new JobLeadsList();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1-Add lead to head of list");
            System.out.println("2-Add lead to tail of list");
            System.out.println("3-Delete a lead");
            System.out.println("4-Print list from head to tail");
            System.out.println("5-Print list from tail to head");
            System.out.println("6-Exit");
            System.out.println("Please enter a valid choice(1 to 6)");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==6){
                break;
            }else if(choice==1){
                System.out.print("Enter Company Name: ");
                String cName=sc.next();
                sc.nextLine();
                System.out.print("Enter Contact Person Name: ");
                String personName= sc.next();
                sc.nextLine();
                System.out.print("Enter Contact Person Phone: ");
                String personPhone= sc.next();
                sc.nextLine();
                System.out.print("Enter job Title: ");
                String title= sc.next();
                sc.nextLine();
                System.out.print("Enter job Description: ");
                String desc=sc.next();
                sc.nextLine();
                joblist.add_to_front(cName,personName,personPhone,title,desc);
            }else if (choice==2){
                System.out.print("Enter Company Name: ");
                String cName=sc.next();
                sc.nextLine();
                System.out.print("Enter Contact Person Name: ");
                String personName= sc.next();
                sc.nextLine();
                System.out.print("Enter Contact Person Phone: ");
                String personPhone= sc.next();
                sc.nextLine();
                System.out.print("Enter job Title: ");
                String title= sc.next();
                sc.nextLine();
                System.out.print("Enter job Description: ");
                String desc=sc.next();
                sc.nextLine();
                joblist.add_to_tail(cName,personName,personPhone,title,desc);
            }
            else if (choice==3){
                System.out.print("Enter Company Name: ");
                String cName=sc.next();
                sc.nextLine();
                System.out.print("Enter job Title: ");
                String title= sc.next();
                sc.nextLine();
                joblist.remove_lead(cName,title);
            }else if (choice==4){
                joblist.print_head_to_tail();
            }else if (choice==5){
                joblist.print_tail_to_head();
            }else {
                System.out.println("Invalid choice: ");
            }
        }
    }
}
