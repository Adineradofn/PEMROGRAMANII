import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public int getNilai() {
        return nilai;
    }

    public void acakNilai() {
        Random r = new Random();
        this.nilai = r.nextInt(6) + 1;
    }
}

public class SOAL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDadu = scanner.nextInt();

        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }

        int total = 0;
        for (Dadu dadu : daftarDadu) {
            total += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
