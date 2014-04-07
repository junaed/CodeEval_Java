
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
public class LowestCommonAncestor {

    int data;
    LowestCommonAncestor left;
    LowestCommonAncestor right;

    public LowestCommonAncestor(int data, LowestCommonAncestor left, LowestCommonAncestor right) {

        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int findAncestor(int left, int right) {

        if (this.data >= left && this.data <= right) {
            return this.data;
        } else if (left < this.data && right < this.data && this.left != null) {
            return this.left.findAncestor(left, right);
        } else if (left > this.data && right > this.data && this.right != null) {
            return this.right.findAncestor(left, right);
        }
        return -1;
    }

    public static void main(String[] args) {

        LowestCommonAncestor n10 = new LowestCommonAncestor(10, null, null);
        LowestCommonAncestor n29 = new LowestCommonAncestor(29, null, null);
        LowestCommonAncestor n20 = new LowestCommonAncestor(20, n10, n29);
        LowestCommonAncestor n3 = new LowestCommonAncestor(3, null, null);
        LowestCommonAncestor n8 = new LowestCommonAncestor(8, n3, n20);
        LowestCommonAncestor n52 = new LowestCommonAncestor(52, null, null);
        LowestCommonAncestor root = new LowestCommonAncestor(30, n8, n52);

        Scanner scanner = new Scanner(System.in);
//        File file = new File(args[0]);
        try {
//            scanner = new Scanner(file);
            String str;
            int cp = 0;
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                String[] num = str.split(" ");
                int l = Integer.parseInt(num[0]);
                int r = Integer.parseInt(num[1]);
                if(l>r){
                    int t = l;
                    l = r;
                    r = t;
                }
                int t = root.findAncestor(l, r);
                if (t != -1) {
                    if (cp > 0) {
                        System.out.println("");
                    }
                    cp ++;
                    System.out.print(t);
                }
            }

        } catch (Exception ex) {
//            Logger.getLogger(LowestCommonAncestor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
