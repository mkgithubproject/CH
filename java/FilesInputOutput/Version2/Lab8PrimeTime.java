package lab.pkg8.prime.time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Course: EET218 - Java Programming
 * Author:
 * Created: Apr 23, 2022
 * Lab # Notes:
 */
public class Lab8PrimeTime {
    public static long[] primenumbers() {
        long[] primes = new long[1000];
        primes[0]=2;
        // 2 is prime
        int candidate=3;
        // 1 is not prime
        for (int i = 1; i < 1000; i++) {
            while (!isPrime(candidate)) {
                candidate++;
            }
            primes[i]=candidate;
            candidate++;
        }
        return primes;
    }
    public static boolean isPrime(int pCandidate) {
        for(int i=2;i<pCandidate;i++){
            if(pCandidate%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        /**
         * @param args the command line arguments
         * @throws java.io.IOException
         */
        BufferedWriter out = null;
        File inFile=null;
        try {
             inFile = new File("Lab8Primetime.txt");
            if (!inFile.exists()) {
                inFile.createNewFile();
            }
            FileWriter fw = new FileWriter(inFile,false);
            out = new BufferedWriter(fw);
            for (long number : primenumbers()) {
                //System.out.println(number);
                out.write(String.valueOf(number) + "\r\n");
            }
            System.out.println("File written Successfully..");
        } catch (IOException e) {
            System.out.println("ERROR");
        } finally {
            out.close();
        }
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        String input = "";
        String contentLine = br.readLine();
        while (contentLine != null) {
            input+=contentLine+"\n";
            contentLine = br.readLine();
        }
        System.out.println("File reading content...");
        System.out.println(input);

       }
    }
