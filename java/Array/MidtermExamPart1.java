public class MidtermExamPart1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 7, 10};

        int result[]= processArray(myArray);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

    public static int[] processArray(int[] myArray) {
        int result[]=new int[3];
        // Your code here
        int totalSumOfElements=0;
        int indexOfLastOccurenceOf7=-1;
        int sumOfFirstHalf=0;
        int sumOfSeconfHalf=0;
        for(int i=0;i<myArray.length;i++){
            //totalSumOfElements sum
            totalSumOfElements+=myArray[i];
            //indexOfLastOccurenceOf7
            if(myArray[i]==7){
                indexOfLastOccurenceOf7=i;
            }
            //sumOfFirstHalf
            if(i<myArray.length/2){
                sumOfFirstHalf+=myArray[i];
            }
            //sumOfSeconfHalf
            //// length is even
            if(myArray.length%2==0 && i>=myArray.length/2){
                sumOfSeconfHalf+=myArray[i];
            }else if(myArray.length%2!=0 && i>myArray.length/2){
                sumOfSeconfHalf+=myArray[i];
            }
        }
        result[0]=totalSumOfElements;
        result[1]=sumOfFirstHalf-sumOfSeconfHalf;
        result[2]=indexOfLastOccurenceOf7;
        return result;
    }
}
