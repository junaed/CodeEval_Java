
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
public class DetectingCycles {

    public static void main(String[] args) {

        Scanner scanner = null;
        File file = new File(args[0]);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DetectingCycles.class.getName()).log(Level.SEVERE, null, ex);
        }
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            String[] numbers = str.split(" ");
            int[] nm = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                nm[i] = Integer.parseInt(numbers[i]);
            }

            int lp = 0;
            boolean found = false;
            for (int i = 0; i < nm.length - 1; i++) {
                for (int j = i+1; j < nm.length; j++) {
                    if (nm[i] == nm[j]) {
                        //cycle found?
                        int cp = 0;
//                        if (lp > 0) {
//                            System.out.println("");
//                        }
//                        lp++;
                        for (int k = i; k < j; k++) {
                            if (cp > 0) {
                                System.out.print(" ");
                            }
                            cp++;
                            System.out.print(nm[k]);
                        }
                        found = true;
                        break;
                    }

                }
                if(found) break;
            }
            System.out.println("");
        }

    }

}
