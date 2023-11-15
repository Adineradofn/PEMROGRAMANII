public class SOAL3 {

    public static void main(String[] args) {
        PEGAWAI p1 = new PEGAWAI();
        // Baris ini terjadi error karena tidak ada titik koma (;)

        //Mengatur nilai variabel Nama dari objek p1 menjadi "Roi"
        p1.Nama = "Roi";
        p1.Asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        //pemanggilan metode setUmur
        p1.setUmur(17);

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.Jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}