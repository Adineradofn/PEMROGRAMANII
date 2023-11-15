public class PEGAWAI {
    public String Nama;
    //Baris ini terjadi error karena tipe data pada gettersetter dan main method tidak sesuai

    //public char asal;
    public String Asal;
    public String Jabatan;
    public int umur;

    public String getNama() {
        return Nama;
    }

    public String getAsal() {
        return Asal;
    }
    //Baris ini terjadi error karena tidak ada value

    //public void setJabatan() {
    public void setJabatan(String j) {
        this.Jabatan = j;
    }

    // Ini adalah deklarasi metode setUmur yang mengambil satu parameter bertipe data int dengan nama u.
    public void setUmur(int u) {
        this.umur = u;
    }
}