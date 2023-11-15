import java.util.Scanner;
public class PRAK101_2210817310003_AdineradoFalahNugraha {

    public static void main(String[] args) {

        String nama, tempat;
        int tanggal, tahun, tinggi, berat, bulan;

        String[] bulann = {"","Januari", "Febuari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        Scanner ketikan = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = ketikan.nextLine();

        System.out.print("Masukkan Tempat: ");
        tempat = ketikan.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal = ketikan.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        bulan = ketikan.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        tahun = ketikan.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        tinggi = ketikan.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        berat = ketikan.nextInt();

        System.out.println("Nama Lengkap "+nama+", Lahir di "+tempat+ " pada Tanggal "+tanggal+" "+bulann[bulan]+" "+tahun+" Tinggi Badan "+tinggi+" cm dan Berat Badan "+berat+" kilogram");
    }

}