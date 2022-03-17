public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<Integer>obj= new LinkedList();
        obj.addAtIndex(5,0);
        obj.addAtIndex(8,1);
        obj.addAtIndex(4,2);
        obj.addAtIndex(10,3);
        //obj.addAtIndex(12,40); // error: Your index is out of the list bounds
        System.out.println(obj.getAtIndex(0));
        System.out.println(obj.getAtIndex(1));
        System.out.println(obj.getAtIndex(2));
        System.out.println(obj.getAtIndex(3));
        //obj.clear();
        //System.out.println(obj.getAtIndex(3));
       // System.out.println(obj.removeAtIndex(2));
        //System.out.println(obj.getAtIndex(0));
        System.out.println(obj.remove(10));
        //System.out.println(obj.getAtIndex(2));
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
    }
}
