import java.util.*;
public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day: ");
        int input_day=sc.nextInt();// take user value for day
        System.out.print("Enter month: ");
        String input_month=sc.next();// take user input for month
        // find and print season for day and month
        if(input_month.toLowerCase().equals("march")){
            if(input_day>=1 && input_day<=31){
               if(input_day<=19){
                   System.out.println("Winter");
               }else{
                   System.out.println("Spring");
               }
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("april")){
            if(input_day>=1 && input_day<=30){
                System.out.println("Spring");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("may")){
            if(input_day>=1 && input_day<=31){
                System.out.println("Spring");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("june")){
            if(input_day>=1 && input_day<=30){
                if(input_day<=20){
                    System.out.println("Spring");
                }
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("july") || input_month.toLowerCase().equals("august")){
            if(input_day>=1 && input_day<=31){
                System.out.println("Summer");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("september")){
            if(input_day>=1 && input_day<=30){
                if(input_day<=21){
                    System.out.println("Summer");
                }else{
                    System.out.println("Autumn");
                }
            }else{
                System.out.println("Invalid");
            }
        }else if(input_month.toLowerCase().equals("october")){
            if(input_day>=1 && input_day<=31){
                System.out.println("Autumn");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("november")){
            if(input_day>=1 && input_day<=30){
                System.out.println("Autumn");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("december")){
            if(input_day>=1 && input_day<=31){
                if(input_day<=20){
                    System.out.println("Autumn");
                }else{
                    System.out.println("Winter");
                }
            }else{
                System.out.println("Invalid");
            }
        }else if(input_month.toLowerCase().equals("january")){
            if(input_day>=1 && input_day<=31){
                System.out.println("Winter");
            }else{
                System.out.println("Invalid");
            }
        }
        else if(input_month.toLowerCase().equals("february")){
            if(input_day>=1 && input_day<=29){
                System.out.println("Winter");
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
