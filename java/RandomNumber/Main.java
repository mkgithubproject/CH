import java.util.*;
public class Main
{ // random number from min to max both are exclusive
	public static void main(String[] args) {
	    int min=1;
	    int max=10;
	    for(int i=0;i<500;i++){
	        int randomNumber = (int) (Math.random()*(max-min+1)) + min;
		System.out.println(randomNumber);
	    }
	    
	}
}
