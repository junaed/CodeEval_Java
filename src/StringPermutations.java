
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class StringPermutations {

    public static void swap(char[] str, int i, int j) {

        char t = str[i];
        str[i] = str[j];
        str[j] = t;
    }

    public static void allPermutations(char[] str, int start, int end, List<String> results) {

        if (start == end) {
            results.add(new String(str));
            return;
        }
        for (int i = start; i < end; i++) {
//            swap(str, i, start);
            allPermutations(str, start + 1, end, results);
            swap(str, i, start);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        try {
//            File file = new File(args[0]);
//            scanner = new Scanner(file);
//        } catch (Exception e) {
//        }
        String str;
        int l=0;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            ArrayList<String> results = new ArrayList<>();
            allPermutations(str.toCharArray(), 0, str.length(), results);

            Collections.sort(results);
            int c = 0;
            if(l>0)System.out.println("");
            for (String s : results) {
                if (c > 0) {
                    System.out.print(",");
                }
                System.out.print(s);
                c++;
            }
            l++;
        }
        scanner.close();
    }

}
