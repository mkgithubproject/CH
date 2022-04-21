import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static void insertHiLow(ArrayList<Integer>list){
        // selectio sort
          for(int i=0;i<list.size();i++){
              int index=i;
              for(int j=i;j< list.size();j++){
                  if(list.get(j)>list.get(index)){
                      index=j;
                  }
              }
              int biggerNumber=list.get(index);
              list.set(index,list.get(i));
              list.set(i,biggerNumber);
          }
    }
    public static  void alphabetize(ArrayList<String> list){
        // selection sort
        for(int i = 0; i < list.size(); i++)
        {    int index=i;
            for(int j = i; j < list.size(); j++)
            {    // compareTo() method compares two strings lexicographically.
                if(list.get(j).compareTo(list.get(index)) > 0)//words[i] is greater than words[j]
                {
                    index=j;
                }
            }
            String biggerString=list.get(index);
            list.set(index,list.get(i));
            list.set(i,biggerString);
        }
    }

    public static void main(String[] args) {
        // for ArrayList of numbers
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.print("How many number you want to add in the arraylist: ");
        int size=sc.nextInt();
        System.out.println("Enter "+size+" Elements");
        for(int i=0;i<size;i++){
            numbers.add(sc.nextInt());
        }
        insertHiLow(numbers);
        System.out.println("Hi-Low Sort: "+numbers+"\n");


        // for ArrayList of strings

        ArrayList<String>words=new ArrayList<String>();
        System.out.print("How many words you want to add in the arraylist: ");
        size=sc.nextInt();
        System.out.println("Enter "+size+" words");
        sc.nextLine();
        for(int i=0;i<size;i++){
            String word=sc.nextLine();
            words.add(word);
        }
        alphabetize(words);
        System.out.println("Alpha Sort: "+words+"\n");

    }
}
