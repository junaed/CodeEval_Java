
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
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        int[] map;
        Scanner scanner = new Scanner(System.in);

//        try {
//            File file = new File(args[0]);
//            scanner = new Scanner(file);
//        } catch (Exception e) {
//        }
        String str;
        int l = 0;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            map = new int[256];
            int length = str.length();
            for (int i = 0; i < length; i++) {

                int index = str.charAt(i) - '0';
                if (map[index] == 0) {
                    map[index] = i + 1;
                } else {
                    map[index] = Integer.MAX_VALUE;
                }
            }

            int lowest = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 0; i < 256; i++) {
                if (map[i] > 0 && map[i] < lowest) {
                    idx = i;
                    lowest = map[i];
                }

            }
            
            char c = (char)(idx + '0');
            System.out.println(c);
            
        }
        scanner.close();
    }

}
