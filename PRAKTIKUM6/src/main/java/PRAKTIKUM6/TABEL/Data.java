package PRAKTIKUM6.TABEL;
public class Data {

    private String NIM = null;
    private String Nama = null;

    public Data() {
    }

    public Data(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}
