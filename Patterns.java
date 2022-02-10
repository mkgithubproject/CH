public class Main
{
	public static void main(String[] args) {
		System.out.println("Pattern-1:");
		int row=1;
		// pattern-1 has 4 row so run outer loop till 4 times
		while(row<=4){
		    int col=1;
		    // first row has first col and second row has two col and so on, so col<=row 
		    while(col<=row){
		        System.out.print("*"+" ");
		        col++;
		    }
		    row++;
		    // change line
		    System.out.println();
		}
		System.out.println("Pattern-2:");
		row=1;
		// pattern-2 has 4 row
		while(row<=4){
		    int col=0;
		    // every col is starting from zero and then increment
		    while(col<row){
		        System.out.print(col+" ");
		        col++;
		    }
		    row++;
		    System.out.println();
		}
		System.out.println("Pattern-3:");
		row=1;
		//pattern-3 has 5 row
		while(row<=5){
		    int col=7-row;
		    //every row has 7-row col
		    while(col>0){
		        System.out.print("*"+" ");
		        col--;
		    }
		    row++;
		    System.out.println();
		}
		System.out.println("Pattern-4:");
		row=1;
		while(row<=5){
		    int col=0;
		    while(col<(7-row)){
		        System.out.print(col+" ");
		        col++;
		    }
		    row++;
		    System.out.println();
		}
	}
}
