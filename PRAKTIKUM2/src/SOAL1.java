import java.text.DecimalFormat;
public class SOAL1 {
    public SOAL1() {
    }
    public static void SOAL1(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        BUAH A = new BUAH();
        A.nama = "Apel";
        A.berat = 0.4;
        A.harga = 7000;
        A.totalbeli = 40;
        A.info();

        System.out.println("Harga Sebelum Diskon: Rp" + df.format(A.getTotalharga()));
        System.out.println("Total Diskon: Rp" + df.format(A.getTotaldiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + df.format(A.getSetelahdiskon()));
        System.out.println("");

        BUAH B = new BUAH();
        B.nama = "Mangga";
        B.berat = 0.2;
        B.harga = 3500;
        B.totalbeli = 15;
        B.info();

        System.out.println("Harga Sebelum Diskon: Rp" + df.format(A.getTotalharga()));
        System.out.println("Total Diskon: Rp" + df.format(A.getTotaldiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + df.format(A.getSetelahdiskon()));
        System.out.println("");

        BUAH C = new BUAH();
        C.nama = "Alpukat";
        C.berat = 0.25;
        C.harga = 10000;
        C.totalbeli = 12;
        C.info();

        System.out.println("Harga Sebelum Diskon: Rp" + df.format(C.getTotalharga()));
        System.out.println("Total Diskon: Rp" + df.format(C.getTotaldiskon()));
        System.out.println("Harga Setelah Diskon: Rp" + df.format(C.getSetelahdiskon()));
    }
}
