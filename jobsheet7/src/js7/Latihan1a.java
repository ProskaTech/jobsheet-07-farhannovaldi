package js7;

import java.util.Scanner;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
public class Latihan1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah;
        for (jumlah = 0; jumlah < 10; jumlah += 1)
            System.out.println(nama);
    }
}
