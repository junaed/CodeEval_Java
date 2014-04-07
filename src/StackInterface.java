
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
public class StackInterface {

    private static ArrayList<Integer> stack = new ArrayList<Integer>();
    private static int top = 0;

    public static void push(int i) {
        if (stack != null) {
            stack.add(i);
            top++;
        }
    }

    public static Integer pop2() {
        Integer r = null;
        if (top % 2 == 0 && top > 0) {
            top--;
            r = stack.get(top);
            stack.remove(top);
            top--;
            stack.remove(top);
        } else if (top > 0) {

            top--;
            r = stack.get(top);
            stack.remove(top);
        }

        return r;

    }

    public static void main(String[] args) {
        try {
            Scanner scanner = null;
            File file;
            String s;
            file = new File(args[0]);
            scanner = new Scanner(file);

            int lc = 0;
            while (scanner.hasNextLine()) {
                stack.removeAll(stack);
                top = 0;
                s = scanner.nextLine();
                String[] numbers = s.split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    Integer t = Integer.parseInt(numbers[i]);
                    push(t);
                }
                Integer popped;
                int sp = 0;
                if (lc > 0) {
                    System.out.println("");
                }
                lc++;
                while ((popped = pop2()) != null) {

                    if (sp > 0) {
                        System.out.print(" ");
                    }
                    sp++;
                    System.out.print(popped);
                }

            }
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(StackInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
