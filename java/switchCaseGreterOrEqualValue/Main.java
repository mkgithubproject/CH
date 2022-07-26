import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        System.out.println("Program for converting metrics and degree Latin honors");
        do {
            System.out.println();
            System.out.println("OPTIONS");
            System.out.println("1: Conversion of cubic feet to U.S. bushels");
            System.out.println("2: Conversion of miles to kilometers");
            System.out.println("3: Compute the graduation honors title");
            System.out.println("9: End the Program");
            System.out.println();
            System.out.print("Pick one:"); // obtaining user choice
            input = scan.nextInt();
            switch(input) { // Controlled by user input, a method is executed
                case 1: feetToBushel(scan);
                    break;
                case 2: miToKm(scan);
                    break;
                case 3: graduationHonors(scan);
                    break;
                case 9: break;
                default: System.out.println("Invalid selection; please try again!");
            }

        } while(input != 9); // Program continues till "End the Program" is chosen by user

        System.out.println("Many thanks for utilizing the software. Goodbye!");
        scan.close();
    }
    // conversion formula for feet to U.S. bushels
    public static void feetToBushel(Scanner scan) {
        System.out.println();
        // obtaining input from the user
        System.out.print("Type in cubic feet: ");
        double feet = scan.nextDouble();
        // doing a computation and showing the outcome
        double bushel = feet * 0.803564;
        System.out.println(+feet + " cubic ft. = "+String.format("%.4f",bushel)+" U.S. bushels");

    }
    // converting kilometers to miles
    public static void miToKm(Scanner scan) {
        System.out.println();
        // obtaining input from the user
        System.out.print("Type in the miles: ");
        double mi = scan.nextDouble();
        // doing a computation and showing the outcome
        double km = mi * 1.60934;
        System.out.println(+mi + " miles = "+String.format("%.4f",km)+" km");


    }
    // determining the graduate title
    public static void graduationHonors(Scanner scan) {
        System.out.println();
        // obtaining input from the user
        System.out.print("Type in the GPA:");
        scan.nextLine();
        String gpa = scan.nextLine();
        double convertToDouble=Double.parseDouble(gpa);
        if(convertToDouble>=4){
            gpa=">=4";
        }

        // showign the result
        switch(gpa) {
            case ">=4"  : System.out.println("Your latin honor is Summa Cum Laude!");
                break;
            case "3.9" :
            case "3.8" : System.out.println("Your latin honor is Magna Cum Laude!");
                break;
            case "3.7":
            case "3.6":
            case "3.5": System.out.println("CoYour latin honor is Cum Laude!");
                break;
            default : System.out.println("Sorry, the GPA has to be 3.5 or higher to graduate with latin honor.");
        }

    }

}
