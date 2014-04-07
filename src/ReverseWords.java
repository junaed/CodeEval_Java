
import java.io.File;
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
public class ReverseWords {

    public static String reverseString(String str) {

        int l = str.length();
        StringBuilder sbr = new StringBuilder();
        for (int i = l - 1; i >= 0; i--) {
            sbr.append(str.charAt(i));
        }

        str = sbr.toString();
        return str;
    }

    public static void main(String[] args) {

        Scanner scanner = null;
        try {

            File file = new File(args[0]);
            scanner = new Scanner(file);
            String str;

            while (scanner.hasNextLine()) {
                str = scanner.nextLine();

                str = reverseString(str);
                int l = str.length();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < l; i++) {
                    if (str.charAt(i) != ' ') {
                        sb.append(str.charAt(i));
                    } else {
                        String s = sb.toString();
                        s = reverseString(s);
                        System.out.print(s + " ");
                        sb.delete(0, sb.length());
                    }

                }
                if (sb.length() > 0) {
                    String s = sb.toString();
                    s = reverseString(s);
                    System.out.println(s);
                
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ReverseWords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
