
import java.util.ArrayList;
import java.util.BitSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junaed
 */
public class PrimePalindrome {

    public static final int N = 1000;
    public static BitSet bitset = new BitSet(N + 1);
    public static ArrayList<Integer> primeNumbers = new ArrayList<>();

    public static void genPalindroms() {
        for (int i = 2; i <= N; i++) {
            if (!bitset.get(i)) {
                for (int j = i + i; j <= N; j += i) {
                    bitset.set(j);
                }
                primeNumbers.add(i);
            }
        }

    }

    public static boolean isPalindrom(int i) {
//        boolean b = true;

        String s = i + "";
        int l = s.length();
        for (int j = 0; j < l / 2; j++) {

            if (s.charAt(j) != s.charAt(l - 1 - j)) {
//                b = false;
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        genPalindroms();

        for (int i = primeNumbers.size() - 1; i >= 0; i--) {
            if (isPalindrom(primeNumbers.get(i))) {
                System.out.print(primeNumbers.get(i));
                break;
            }

        }
    }

}
