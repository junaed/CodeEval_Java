
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
public class FollowingInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            File file = new File(args[0]);
            scanner = new Scanner(file);
        } catch (Exception e) {
        }
        String str;
        int l = 0;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            StringBuilder strb = new StringBuilder(str);
            int pos = strb.length() - 1;

            char prev = strb.charAt(pos);
            pos--;

            while (pos >= 0) {
                if (strb.charAt(pos) < prev) {
                    //found
                    break;
                }
                prev = strb.charAt(pos);
                pos--;
            }

            if (pos < 0) {
                strb.insert(0, '0');
                pos = 0;
            }

            char smallest = strb.charAt(pos + 1);
            int sIndex = pos + 1;
            for (int i = pos + 1; i < strb.length(); i++) {

                if (strb.charAt(i) > strb.charAt(pos) && strb.charAt(i) <= smallest) {
                    smallest = strb.charAt(i);
                    sIndex = i;
                }
            }

            strb.insert(pos, smallest);
            strb.deleteCharAt(sIndex + 1);

            prev = strb.charAt(pos + 1);
            strb.deleteCharAt(pos + 1);

            sIndex = pos + 1;
            String tempstr = strb.substring(sIndex);
            StringBuilder tempsb = new StringBuilder(tempstr);
            tempsb = tempsb.reverse();

            strb.setLength(sIndex);
            strb.append(tempsb);
//            boolean inserted = false;
            while (sIndex < strb.length() && strb.charAt(sIndex) < prev) {

                sIndex++;
            }

            //if (!inserted) {
            strb.insert(sIndex, prev);
            //}

            System.out.println(strb);

        }
        
        scanner.close();
    }

}
