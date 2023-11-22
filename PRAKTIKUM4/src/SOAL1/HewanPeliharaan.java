package SOAL1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String Nama;
    private String Ras;

    public HewanPeliharaan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        this.Nama = scanner.nextLine();

        System.out.print("Ras: ");
        this.Ras = scanner.nextLine();

        scanner.close();
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.Nama);
        System.out.println("ras : " + this.Ras);
    }
}
