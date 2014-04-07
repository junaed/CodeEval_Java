
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junaed
 */
public class NumberOfOnes {

    public static void numberOfOnes(int n) {

        int count = 0;
        while ((n | 0) != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;
        }

        System.out.println(count);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File file;
        try {
            file = new File(args[0]);
            scanner = new Scanner(file);
        } catch (Exception e) {
        }

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();
            numberOfOnes(n);
        }

        scanner.close();

    }

}
