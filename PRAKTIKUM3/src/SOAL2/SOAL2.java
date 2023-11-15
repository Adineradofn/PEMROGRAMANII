import java.util.*;

class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
}

public class SOAL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");

        for (int i = 0; i < n; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = "";

            if (jenisKepemimpinan.equals("presiden") || jenisKepemimpinan.equals("perdana menteri")) {
                namaPemimpin = scanner.nextLine();
            }

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (jenisKepemimpinan.equals("presiden") || jenisKepemimpinan.equals("perdana menteri")) {
                tanggalKemerdekaan = scanner.nextInt();
                bulanKemerdekaan = scanner.nextInt();
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
            }

            negaraList.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
        }

        for (Negara negara : negaraList) {
            System.out.print("Negara " + negara.getNama() + " mempunyai ");

            if (negara.getJenisKepemimpinan().equals("presiden")) {
                System.out.println("Presiden bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + bulanMap.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            } else if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Raja bernama " + negara.getNamaPemimpin());
            } else if (negara.getJenisKepemimpinan().equals("perdana menteri")) {
                System.out.println("Perdana Menteri bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + bulanMap.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            }
        }
    }
}

