
import java.util.ArrayList;
import java.util.Scanner;

public class Stack<T> {
    private ArrayList<T> list=new ArrayList<T>();// inbuilt arraylist for implementation stack
    private int top;
    // constructor
    public Stack(){
        top=-1;// initially Declare top with -1
    }
    // push the element in to the stack and increment the value of top
    public void push(T x){
        top++;
        list.add(x);
    }
    // pop the value of the stack if stack is not empty and return poped value and also decrement the top value
    public T pop(){
        if(!isEmpty()){
            T popedElement=list.get(top);
            top--;
            return popedElement;
        }
        return null;
    }
    public boolean isEmpty(){
        // top==0 means stack is empty return true else it will return false.
        return top==-1;
    }
   public String checkPalindrome(){

       String reverseString = "";
       String inputString="";
       Stack<Character>st2=new Stack<>();// declare stack 2

       while (!isEmpty()) {// find reverse string and put the elements in to the second stack for find out original string
           char poped= (char) pop();
           reverseString = reverseString+poped;
           st2.push(poped);
       }
       while (!st2.isEmpty()) {// find original or input string using stack 2
           inputString = inputString+st2.pop();
       }
       if (inputString.equals(reverseString))// if input string equal to original return true else return false
          return "True";
       else
           return "false";
   }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Character>obj=new Stack<>(); // create object of stack class
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
           char ch=sc.next().charAt(0);
           obj.push(ch);
       }
      System.out.println(obj.checkPalindrome());

    }
}
