import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class LabProgram {
    static int comparisons=0;
    static int recursions=1;// initially we have called binarySearch one time from main function

    // Read and return an ArrayList of integers.
    private static ArrayList<Integer> readNums(Scanner scnr) {
        int size = scnr.nextInt();                // Read size of ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i) {          // Read the numbers
            nums.add(scnr.nextInt());
        }

        return nums;
    }
    static public int binarySearch(int target, ArrayList<Integer> integers,
                                   int lower, int upper) {
        if(lower>upper){// base case lower cross the upper
            return -1;
        }
        int mid=(lower+upper)/2;
        comparisons++;// increment comparison
        if(integers.get(mid)==target){// check mid element s target
            return mid;
        }
        comparisons++;
        recursions++;
        if(integers.get(mid)>target){// check mid is greater than target search left side else search right side of the array
           return binarySearch(target,integers,lower,mid-1);
        }else{
           return binarySearch(target,integers,mid+1,upper);
        }
    }

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        // Input a list of integers
        ArrayList<Integer> integers = readNums(scnr);
        // Input a target value for the search
        int target = scnr.nextInt();

        int index = binarySearch(target, integers, 0, integers.size() - 1);
        System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                index, recursions, comparisons);
    }
}
