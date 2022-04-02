import java.util.*;
public class bubbleSortArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> items = new ArrayList<>();

        Scanner inp = new Scanner(System.in);
//Ask the user for how many elements to be added.
        System.out.println("Enter the number of elements to be added");
        int HowManyElements = inp.nextInt();
//Complete the for loop for adding the elements to the ArrayList. [3 Marks]

        for (int i = 1 ; i <=HowManyElements; i++){
            System.out.println("Enter element "+i);
            int ele= inp.nextInt();
            items.add(ele);
        }
//Print out the Original ArrayList after user input Here. [1 Mark]
        System.out.println("ArrayList is like....");
        for(int ele:items){
            System.out.print(ele+" ");
        }
        /* Call the non-static bubbleSort method using the instantiated object 'list' of the class it is defined [1 Mark] */
        bubbleSortArrayList list=new bubbleSortArrayList();
        list.bubbleSort(items);
    }
    /*Complete the BubbleSort Algorithm as per the ArrayList usage and methods. Remember, the way to access the index elements is different in arrayLists than in Arrays. [3 Marks]*/
    public void bubbleSort (ArrayList<Integer> items){
        for(int i=0;i< items.size()-1;i++){
            for(int j=i+1;j< items.size();j++){
                if(items.get(i)>items.get(j)){
                    // if next element is lees than its previous swap elements
                    //swap
                    int temp=items.get(j);
                    items.set(j,items.get(i));
                    items.set(i,temp);
                }
            }
        }
        System.out.println();
        System.out.println("After sorting ArrayList is like.....");
        for (int ele:items){
            System.out.print(ele+" ");
        }
        //Print out the Sorted ArrayList Here. [1 Mark]
    }

}
