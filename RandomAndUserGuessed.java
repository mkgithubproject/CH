import java.io.*;
import java.util.*;
public class RandomAndUserGuessed
{      
	public static void main(String[] args) {
	    // Instantiate HashSet
        HashSet<Double> set = new HashSet<>();
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        while(true){
           int x=random.nextInt(20);
           System.out.println("Enter a number:");
           double user=sc.nextDouble();
           
           if(x==user){
               System.out.println("Matched!");
               break;
           }else{
               set.add(user);
           }
           Iterator itr = set.iterator();
           for(int i = 0; itr.hasNext(); i++) {
               double value = (double)itr.next();
                if (i == set.size()-2) {
                    System.out.println("previous guessed element is: "+value);
                    break;
                }
            }
           
        }
          
        }
		
	}



