package SOAL2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }

    public void displayDetailKucing() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
    }

    @Override
    public void display() {
        displayDetailKucing();
    }
}


