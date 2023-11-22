package SOAL2;

public abstract class HewanPeliharaan {
    protected String nama;
    protected String ras;

    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }

    public abstract void display();
}
