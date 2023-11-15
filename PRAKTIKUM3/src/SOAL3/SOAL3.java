import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

public class SOAL3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // mengonsumsi karakter newline

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = scanner.nextLine();
                daftarMahasiswa.add(new Mahasiswa(nama, nim));
                System.out.println("Mahasiswa " + nama + " ditambahkan.");
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nimHapus = scanner.nextLine();
                boolean dihapus = false;
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nimHapus)) {
                        daftarMahasiswa.remove(mahasiswa);
                        dihapus = true;
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                        break;
                    }
                }
                if (!dihapus) {
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                String nimCari = scanner.nextLine();
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nimCari)) {
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (pilihan == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
