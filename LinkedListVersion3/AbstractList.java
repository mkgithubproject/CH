public abstract class  AbstractList<E>{
    public abstract boolean add(E data);
    public abstract void add(int index, E data);
    public abstract E get(int index);
    public abstract E set(int index, E data);
    public abstract E remove(int index);
    public abstract void clear();
    public abstract boolean isEmpty();
    public abstract int size();
}
