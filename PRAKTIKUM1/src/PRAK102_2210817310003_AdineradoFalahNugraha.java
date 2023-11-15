import java.util.Scanner;

public class PRAK102_2210817310003_AdineradoFalahNugraha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int deret = in.nextInt();
        int angkaawal = deret;

        while (deret-- >= 0) {
            if (angkaawal % 5 == 0) {
                if(deret==0){
                    System.out.print((angkaawal/5)-1);
                    break;
                }
                System.out.print((angkaawal/5)-1 + ",");
            } else {
                if(deret==0){
                    System.out.print(angkaawal);
                    break;
                }
                System.out.print(angkaawal + ",");
            }
            angkaawal++;
        }
    }
}
