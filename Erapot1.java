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
public class Erapot1 {

    public void rapot() {
        String nama[] = new String[100];
        String kelas[] = new String[100];
        int nilai1[] = new int[100];
        int nilai2[] = new int[100];
        int nilai3[] = new int[100];
        int nilai4[] = new int[100];
        int nilai5[] = new int[100];
        int total[] = new int[100];
        int rata[] = new int[100];
        String predikat[] = new String[100];

        Scanner baca = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("|  INPUT                             DATA   |");
        System.out.println("=============================================");
        System.out.print("Ingin Input Berapa Data ? ");
        int t = baca.nextInt();

        for (int a = 1; a <= t; a++) {
            System.out.print("Masukkan Nama Siswa : ");
            nama[a] = baca.next();
            System.out.print("Masukkan Nama Kelas : ");
            kelas[a] = baca.next();
        }
        for (int a = 1; a <= t; a++) {
            System.out.println("Memasukkan Nilai dari " + nama[a]);
            System.out.print("Masukkan Nama Nilai Mat : ");
            nilai1[a] = baca.nextInt();
            System.out.print("Masukkan Nama Nilai BI : ");
            nilai2[a] = baca.nextInt();
            System.out.print("Masukkan Nama Nilai IPA : ");
            nilai3[a] = baca.nextInt();
            System.out.print("Masukkan Nama Nilai IPS : ");
            nilai4[a] = baca.nextInt();
            System.out.print("Masukkan Nama Nilai RPL : ");
            nilai5[a] = baca.nextInt();
        }
        for (int a = 1; a <= t; a++) {
            total[a] = nilai1[a] + nilai2[a] + nilai3[a] + nilai4[a] + nilai5[a];
            rata[a] = (nilai1[a] + nilai2[a] + nilai3[a] + nilai4[a] + nilai5[a]) / 5;
            if (rata[a] <= 70) {
                predikat[a] = "GL";
            } else if (rata[a] > 70 && rata[a] <= 100) {
                predikat[a] = "LL";
            } else {
                predikat[a] = "GJ";
            }
        }
            System.out.println("Nama        Kelas        Mat    BI   IPA   IPS   RPL   Rata2   Predikat");
        for (int a = 1; a <= t; a++) {
            System.out.println(nama[a] + "        " + kelas[a] + "           " + nilai1[a] + "        " + nilai2[a] + "       " + nilai3[a] + "     " + nilai4[a] + "    " + nilai5[a] + "    " + rata[a] + "     " + predikat[a]);
        }

    }
}
