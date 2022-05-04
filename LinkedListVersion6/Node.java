import java.util.Scanner;

public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E item, Node<E> next) {
        //0,      null
        this.item = item;
        this.next = next;
    }
    // getter
    public E getItem() {
        return item;
    }
   //setter
    public void setItem(E item) {
        this.item = item;
    }
   //getter
    public Node<E> getNext() {
        return next;
    }
    //setter
    public void setNext(Node<E> next) {
        this.next = next;
    }
    public int countNumbersWith4(Node<Integer> linkedList) {

        int count =0;

        Node<Integer> p = linkedList;
        while(p != null) {
            int num=Math.abs(p.getItem());
            if(num==4){
                count++;
            }else{
                while(num!=0){
                    int lastDigit=num%10;
                    if(lastDigit==4){
                        count++;
                        break;
                    }
                    num=num/10;
                }
            }
            p=p.getNext();
        }
        //System.out.println(count);
        return count; // You do not need to print anything here.
    }
    public Node<Integer> addInts() {

        Scanner userInput = new Scanner(System.in);

        Node <Integer> start, tail = new Node<>(0, null);
        start = null;
        System.out.println("Enter numbers and enter STOP to finish");

        while(true) {

            if(userInput.hasNextInt()) {
                int numInput = userInput.nextInt();

                if (start == null) {
                    start = new Node<>(numInput, null);
                    tail = start;
                }
                else {
                    Node<Integer> next = new Node<>(numInput, null);
                    tail.setNext(next);
                    tail = tail.getNext();
                }
            }
            else if(userInput.hasNext("STOP") || userInput.hasNext("stop")) {
                break;
            }
            else {
                userInput.next();
                System.out.println("Not a valid input, please enter another integer or type STOP to print off linked list.");
            }
        }

        Node<Integer> p = start;
        while (p != null) {
            System.out.print(p.getItem());
            if (p.getNext() != null) System.out.print(", ");
            p = p.getNext();
        }

        System.out.println();
        return start;
    }

    public static void main(String[] args) {
        Node<Integer>obj=new Node<>(0,null);
        Node<Integer> list=obj.addInts();
        System.out.println(obj.countNumbersWith4(list));

    }

}
