public class SOAL2 {

    public static void main(String[] args) {

        KOPI kopi1 = new KOPI();
        kopi1.NamaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.Harga = 25000;
        kopi1.info();

        kopi1.setPembeli("Alice");
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
    }
}