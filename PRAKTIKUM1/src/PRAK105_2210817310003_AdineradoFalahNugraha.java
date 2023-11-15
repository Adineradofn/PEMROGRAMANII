import java.util.Scanner;
public class PRAK105_2210817310003_AdineradoFalahNugraha {
    public static void main(String[] args) {

        final double PHI = Math.PI;
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jari-jari: ");

        double inputjarijari = input.nextDouble();
            System.out.print("Masukkan tinggi: ");

        double inputtinggi = input.nextDouble();
        double volumetabung = PHI * Math.pow(inputjarijari, 2) * inputtinggi;

            System.out.println("Volume tabung dengan jari-jari: "+inputjarijari+ " dan tinggi "+inputtinggi+" adalah "+volumetabung);
            input.close();
    }
}