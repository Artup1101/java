/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintangangkagenap;

import java.util.Scanner;

/**
 *
 * @author ACER E5
 */
public class pemanggilan {
    
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        Erapot1 u = new Erapot1();
        Erapot1 k = new Awalan();

        boolean run = true;
        while (run) {

            k.rapot();
            int pilih = baca.nextInt();
            switch (pilih) {
                case 1:
                    u.rapot();
                    run = true;
                    break;
                case 2:
                    run = false;
                    System.out.println("===================================================");
                    System.out.println("|                                                 |");
                    System.out.println("|                  Selamat Tinggal                |");
                    System.out.println("|                                                 |");
                    System.out.println("===================================================");
                    break;
            }

        }
    }
}

