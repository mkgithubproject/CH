
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**

 A table for lookups and reverse lookups

 */

public class U10E08R

{

    private ArrayList<U10E08Item> people;

    /**

     Constructs a LookupTable object.

     */

    public U10E08R()

    {

        people = new ArrayList<U10E08Item>();

    }

    /**

     Reads key/value pairs.

     atparam in the scanner for reading the input

     */

    public void read(Scanner in)

    {

        while(in.hasNext()){

            String name = in.nextLine();

            String number = in.nextLine();

            people.add(new U10E08Item(name, number));

        }

    }

    /**

     Looks up an item in the table.

     atparam k the key to find

     atreturn the value with the given key, or null if no

     such item was found.

     */

    public String lookup(String k)

    {

        String output = null;

        for(U10E08Item item: people){

            if(k.equals(item.getName())){

                output = item.getNumber();

            }

        }

        return output;

    }

    /**

     Looks up an item in the table.

     atparam v the value to find

     atreturn the key with the given value, or null if no

     such item was found.

     */

    public String reverseLookup(String v)

    {

        String output = null;

        for(U10E08Item item: people){

            if(v.equals(item.getNumber())){

                output = item.getName();

            }

        }

        return output;

    }
    public void testProgram() throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the phonebook file: ");
        String fileName = in.nextLine();
        String currentPath = System.getProperty("user.dir");
        fileName=currentPath+"\\src\\"+fileName;
        U10E08R table = new U10E08R();

        FileReader reader = new FileReader(fileName);

        table.read(new Scanner(reader));

        boolean more = true;

        while (more)

        {

            System.out.println("Lookup N)ame, P)hone number, Q)uit?");

            String cmd = in.nextLine();

            if (cmd.equalsIgnoreCase("Q"))

                more = false;

            else if (cmd.equalsIgnoreCase("N"))

            {

                System.out.println("Enter name:");

                String n = in.nextLine();

                System.out.println("Phone number: " + table.lookup(n));

            }

            else if (cmd.equalsIgnoreCase("P"))

            {

                System.out.println("Enter phone number:");

                String n = in.nextLine();

                System.out.println("Name: " + table.reverseLookup(n));

            }

        }


    }
}
