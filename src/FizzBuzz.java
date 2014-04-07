
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
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = null;
        File file;
        //System.out.println(args[0]);
        try {
            file = new File(args[0]);
            scanner = new Scanner(file);
            int A, B, N, testnumber = 1;
            while (scanner.hasNext()) {

                A = scanner.nextInt();
                B = scanner.nextInt();
                N = scanner.nextInt();

                if (testnumber > 1) {
                    System.out.println("");
                }
                for (int i = 1; i <= N; i++) {

                    if (i % A == 0 && i % B == 0) {
                        System.out.print("FB");
                    } else if (i % A == 0) {
                        System.out.print("F");
                    } else if (i % B == 0) {
                        System.out.print("B");
                    } else {
                        System.out.print(i);
                    }

                    if (i < N) {
                        System.out.print(" ");
                    }
                }

                testnumber++;

            }
        } catch (FileNotFoundException ex) {

        } finally {
            scanner.close();
        }

    }

}
