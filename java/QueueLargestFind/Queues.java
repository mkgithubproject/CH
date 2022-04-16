import java.util.Queue;

public class Queues {
    public static  Integer getLargest(Queue<Integer> q){
        // initially initialize largest with Integer min value
        Integer largest=Integer.MIN_VALUE;
        for(Integer ele:q){
            // if queue element is greater than largest update largest
            if(ele>largest){
                largest=ele;
            }
        }
        return largest;// return largest
    }
}
