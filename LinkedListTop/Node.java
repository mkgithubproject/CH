public class Node<T>
{   // Node class having two instance variables
    private T data;
    private  Node<T> next;
    // default constructor
    public Node( ) {
    }
    // argument type constructor
    public Node( T x ) {
        data=x;
    }

    public Node( T x, Node<T> n ) {
       data=x;
       next=n;
    }

    public T getItem() {
        return data;
    }

    public void setItem(T x) {
        data=x;
    }

    public void setNextNode(Node<T> n) {
        next=n;

    }

    public Node<T> getNextNode(){

        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
