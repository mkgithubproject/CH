import java.util.Scanner;

public class Slogan {
    public static void checkIsValidSlogan(String slogan) {
        // check slogan has only alphabet
        for(int i=0;i<slogan.length();i++){
            // if space found continue
            if(slogan.charAt(i)==' '){
                continue;
            }
            // if char is not letter
            if(!Character.isLetter(slogan.charAt(i))){
                System.out.println("Invalid slogan");
                return;
            }
        }
        // calculate duplicate count and unique count
        int duplicateCount=0;
        int uniqueCount=0;
        for(int i=0;i<slogan.length();i++){
            int count=1;
            for(int j=i+1;j<slogan.length();j++){
                if(slogan.charAt(i)==slogan.charAt(j)){
                    count++;
                }
            }
            if(count>1){// if count greater than 1 means duplicate found
                duplicateCount=duplicateCount+count;
            }else{
                uniqueCount=uniqueCount+count;
            }
        }
        if(duplicateCount==uniqueCount){
            System.out.println("All the guidelines are satisfied for "+slogan);
        }else{
            System.out.println(slogan+" does not satisfy the guideline");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String slogan=sc.nextLine();
        checkIsValidSlogan(slogan);

    }


}
