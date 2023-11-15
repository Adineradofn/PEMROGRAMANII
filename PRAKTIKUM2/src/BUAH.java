import java.text.DecimalFormat;

public class BUAH {
    String nama;
    Double berat;
    int harga;
    int totalbeli;
    private Double totalharga;
    private Double totaldiskon;
    private Double setelahdiskon;

    public BUAH() {
    }

    public double getTotalbeli() {
        return (double)this.totalbeli;
    }

    public void setTotalbeli(int totalbeli) {
        this.totalbeli = totalbeli;
    }

    public Double getTotalharga() {
        return this.totalharga = (double)this.harga / this.berat * (double)this.totalbeli;
    }

    public void setTotalharga(Double totalharga) {
        this.totalharga = totalharga;
    }

    public Double getTotaldiskon() {
        return this.totaldiskon = (double)(this.totalbeli / 4 * 4 * this.harga) * 0.02;
    }

    public void setTotaldiskon(Double totaldiskon) {
        this.totaldiskon = totaldiskon;
    }

    public Double getSetelahdiskon() {
        return this.setelahdiskon = this.totalharga - this.totaldiskon;
    }

    public void setSetelahdiskon(Double setelahdiskon) {
        this.setelahdiskon = setelahdiskon;
    }

    public void info() {
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Nama Buah: " + this.nama);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + df.format((long)this.harga));
        System.out.println("Jumlah Beli: " + df.format((long)this.totalbeli) + "kg");
    }
}

