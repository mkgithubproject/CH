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
    public Node<String> addStrings() {

        Scanner userInput = new Scanner(System.in);

        Node <String> start, tail = new Node<>("", null);
        start = null;

        System.out.println("Add strings, if the string contains the letter P (ignore case) the word will be added to the linked list. " +
                "\nIf not, the string will be ignored. Type STOP to exit the program and print the linked list");

        while(true) {

            String wordAdded = userInput.nextLine();

            if(wordAdded.equalsIgnoreCase("stop")) {
                break;
            }
            else if (wordAdded.contains("p") || wordAdded.contains("P")) {

                if (start == null) {
                    start = new Node<>(wordAdded, null);
                    tail = start;
                }
                else {
                    Node<String> next = new Node<>(wordAdded, null);
                    tail.setNext(next);
                    tail = tail.getNext();
                }
            }
            else if(wordAdded.equalsIgnoreCase("stop")) {
                break;
            }
            else {
                System.out.println("The string does not contain a P (ignore case) please enter another string");
            }

        }
        Node<String> p = start;
        while (p != null) {
            System.out.print(p.getItem());
            if (p.getNext() != null) System.out.print(", ");
            p = p.getNext();

        }

        System.out.println();
        return start;
    }
    public Node<String> sortP(Node<String> linkedList) {
        if(linkedList==null){
            return linkedList;
        }
        Node<String> current=linkedList;
        while(current != null) {
            //Node currentToNext will point to node next to current
            Node<String> currentToNext = current.getNext();

            while(currentToNext != null) {
                //If current node's data(string) index of char 'p' is greater than currentToNext's node data index of char 'p', swap the data between them

                if(  current.getItem().toLowerCase().indexOf('p') > currentToNext.getItem().toLowerCase().indexOf('p')) {
                    String temp = current.getItem();
                    current.setItem(currentToNext.getItem());
                    currentToNext.setItem(temp);
                }
                currentToNext = currentToNext.getNext();
            }
            current = current.getNext();
        }
        current=linkedList;
        while(current!=null){
            System.out.print(current.getItem()+" ");
            current=current.getNext();
        }
        return linkedList;
    }
    public static void main(String[] args) {
        Node<String>obj=new Node<String>("0",null);
        Node<String> list=obj.addStrings();
        obj.sortP(list);

    }

}
