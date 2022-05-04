import java.util.Scanner;

public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E item, Node<E> next) {
        //0,      null
        this.item = item;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
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
    public Node<Integer> sortIntegers(Node<Integer> linkedList) {
        boolean descending=false;
        // check list contain number 5 if yes then sort the list descending else sort ascending
        if(linkedList==null){
            return linkedList;
        }
        Node<Integer> current=linkedList;
        while(current!=null){
            if(current.getItem()==5){
                descending=true;
                break;
            }
            current=current.getNext();
        }
        current=linkedList;
        if(descending){
            while(current != null) {
                //Node index will point to node next to current
               Node<Integer> currentToNext = current.getNext();

                while(currentToNext != null) {
                    //If current node's data is smaller than currentToNext's node data, swap the data between them
                    if(current.getItem() < currentToNext.getItem()) {
                       int temp = current.getItem();
                        current.setItem(currentToNext.getItem());
                        currentToNext.setItem(temp);
                    }
                    currentToNext = currentToNext.getNext();
                }
                current = current.getNext();
            }
        }else{
            while(current != null) {
                //Node index will point to node next to current
                Node<Integer> currentToNext = current.getNext();

                while(currentToNext != null) {
                    //If current node's data is greater than currentToNext's node data, swap the data between them
                    if(current.getItem() > currentToNext.getItem()) {
                        int temp = current.getItem();
                        current.setItem(currentToNext.getItem());
                        currentToNext.setItem(temp);
                    }
                    currentToNext = currentToNext.getNext();
                }
                current = current.getNext();
            }

        }
        // print list
        Node<Integer> p = linkedList;
        while (p != null) {
            System.out.print(p.getItem());
            if (p.getNext() != null) System.out.print(", ");
            p = p.getNext();
        }
        System.out.println();

        return linkedList; // Return the start node of your linked list as well as printing it. The "null" can be changed to                         //"start"
    }
    public static void main(String[] args) {
        Node<Integer>obj=new Node<>(0,null);
        Node<Integer> list=obj.addInts();
        obj.sortIntegers(list);

    }

}
