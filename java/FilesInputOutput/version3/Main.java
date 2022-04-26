import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void printNamesWithSameInitials(String filepath) {
        try {
            FileReader fr =new FileReader(filepath);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] elements= line.split(";");
                String firstName = elements[0];
                String lastName = elements[1];
                if(firstName.charAt(0)==lastName.charAt(0)){
                    System.out.println(firstName+" "+lastName);
                }
                line = reader.readLine();
            }
            reader.close();
            fr.close();
        }catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args) {
        printNamesWithSameInitials("D:\\mk\\src\\textfile.txt");
    }
}
