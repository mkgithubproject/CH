public class UserNode<T> {
    T data;
    UserNode<T> next;
    //constructor
    public UserNode(T data) {
        this.data = data;
        this.next = null;
    }
}
