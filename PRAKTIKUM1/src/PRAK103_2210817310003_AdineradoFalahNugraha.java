import java.util.Scanner;
    public class PRAK103_2210817310003_AdineradoFalahNugraha {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int jumlahbaris = scanner.nextInt();
            int bilanganawalderet = scanner.nextInt();
            int jumlahangkaawal = 0;

            do {
                if (bilanganawalderet % 2 != 0) {
                    System.out.print(" " + bilanganawalderet);
                    jumlahangkaawal++;
                }
                bilanganawalderet++;
            } while (jumlahangkaawal < jumlahbaris);
        }
    }

