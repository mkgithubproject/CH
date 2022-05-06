import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Example {
  // scanner class read data from system means from keyboard and read data from file.
    public static void main(String[] args) {
        File inputfile=new File("D:\\mk\\src\\data.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // we read the file until all lines have been read
        while (scanner.hasNextLine()) {
            // we read one line
            String row = scanner.nextLine();
            // we print the line that we read
            System.out.println(row);
        }
    }

    }


