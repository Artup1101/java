/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintangangkagenap;

/**
 *
 * @author ACER E5
 */
public class Bintangangkagenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 3;
        for (int n = 10; n >= 1; n--) {
            for (int o = 3; o < n; o++) {
                System.out.print(m + " ");
                m += 2;
            }
            System.out.println();
        }
    }
}
