import hsa.*;
import java.io.*;
public class Main
{
    static Console c;
    public static void main (String[] args)
    {
        c = new Console ();
        while (true)
        {
            c.println ("How many many words they want generated");
            int n = c.readInt ();
            String[] arr = new String [n];
            for (int i = 0 ; i < n ; i++)
            {
                arr [i] = c.readString ();
            }
            try
            {
                PrintWriter out = new PrintWriter (new FileWriter ("token_yourName.txt"));
                for (int index = 0 ; index < n ; index++)
                {
                    String str = arr [index].toLowerCase ();
                    String uniqueChar = " ";
                    for (int i = 0 ; i < str.length () ; i++)
                    {
                        int flag = 1;
                        for (int j = 0 ; j < str.length () ; j++)
                        {
                            if (i != j)
                            {
                                if (str.charAt (i) == str.charAt (j))
                                {
                                    flag = 0;
                                    break;
                                }
                            }
                        }
                        if (flag == 1)
                        {
                            uniqueChar = uniqueChar + str.charAt (i);
                        }


                    }
                    if (uniqueChar == " ")
                    {
                        uniqueChar = "none is unique";
                    }
                    c.println (arr [index] + "\t\t\t" + uniqueChar);
                    out.println (arr [index] + "\t\t\t" + uniqueChar);
                }
                out.close ();
            }
            catch (IOException e)
            {
                new Message ("Error ");
            }
        }
    }
}
