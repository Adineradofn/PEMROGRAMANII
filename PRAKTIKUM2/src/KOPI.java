import java.text.DecimalFormat;

public class KOPI {
    String NamaKopi;
    String ukuran;
    int Harga;
    private String Pembeli;
    private Double Pajak;

    public String getPembeli() {
        return Pembeli;
    }
    public void setPembeli(String pembeli) {
        this.Pembeli = pembeli;
    }
    public Double getPajak() {
        return Pajak = (Harga * 0.11);
    }
    public void setPajak(Double pajak) {
        this.Pajak = pajak;
    }

    public void info() {
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Nama Kopi: " + NamaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga : Rp. " + df.format(Harga));
    }
}