import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class ArrayListMap<K,V> implements MapInterface{
    // a Pair class which has key value pair value
     class Pair<K,V>{
         K key;
         V value;
         // construtot
         Pair(K key,V value){
             this.key=key;
             this.value=value;
         }
     }
     // create default array list of size 20
    private Pair arr[]=new Pair[20];
     private int size=0;
     //constructor
     ArrayListMap(){
         //
    }
    //increse capacity of array if list is fullfilled.
   private void doubleCapcity(){
       arr = Arrays.copyOf(arr, arr.length*2);
   }
    @Override
    //put key value pair object
    public Object put(Object key, Object value) {
       Pair obj=new Pair(key,value);
       Object value1= get(key);
       if(value1==null){
           if(size>arr.length){
               doubleCapcity();
           }
           arr[size]=obj;
           size++;

           return null;
       }else{
           for(Pair obj1:arr){
               if(obj1!=null && obj1.key.equals(key)){
                   obj1.value=value;
               }
           }
           return value1;
       }

    }

    @Override
    public Object get(Object key) {
         for(Pair obj:arr){
             if(obj!=null && obj.key.equals(key)){
                 return obj.value;
             }
         }
        return null;
    }

    @Override
    public Object remove(Object key) {

         for(int i=0;i<size;i++){
             if(arr[i]!=null && arr[i].key.equals(key)){
                 Object val=arr[i].value;
                for(int j=i;j<size;j++){
                    arr[j]=arr[j+1];
                    size--;
                }
                    return val;
             }
         }
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
         for(Pair obj:arr){
             if (obj!=null && obj.key.equals(key)){
                 return true;
             }
         }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
      arr=new Pair[20];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Set keySet() {
        Set<String> hash_Set = new HashSet<String>();
        for (Pair obj:arr){
            if(obj!=null)
                hash_Set.add((String) obj.key);
        }
        return hash_Set;
    }

    @Override
    public Collection values() {
        Set<Integer> cl = new HashSet<>();
        for (Pair obj:arr){
            if(obj!=null)
               cl.add((Integer) obj.value);
        }
        return cl;
    }
}
