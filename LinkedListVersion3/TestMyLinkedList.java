public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer>obj=new MyLinkedList<>();
        obj.add(2);
        obj.add(20);
        obj.add(5);
        obj.add(15);
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        //obj.clear();
        System.out.println(obj.get(2));
        obj.add(1,16);
        System.out.println(obj.get(1));
        System.out.println(obj.size());
        System.out.println(obj.set(1,18));
        System.out.println(obj.size());
        System.out.println(obj.get(4));
        System.out.println(obj.remove(4));
        System.out.println(obj.size());
        System.out.println(obj.get(3));
    }
}
