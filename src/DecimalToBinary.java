
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junaed
 */
public class DecimalToBinary {

    public static void printBinary(long n) {
        StringBuilder str = new StringBuilder();
        long rem;
        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            str.insert(0, rem);

        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        File file = new File(args[0]);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            long n;
            while (scanner.hasNext()) {
                n = scanner.nextInt();
                if(n>0) printBinary(n);
                else System.out.println("0");
            }

        } catch (Exception ex) {
//            Logger.getLogger(DecimalToBinary.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            scanner.close();
        }

    }

}
