

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author junaed
 */
public class Endianness {

    public static void main(String[] args) {

        short i = 1;
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN) {
            System.out.print("BigEndian");
        } else {
            System.out.print("LittleEndian");
        }

    }

}
