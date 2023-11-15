import java.util.Scanner;
public class PRAK104_2210817310003_AdineradoFalahNugraha {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String pemainabu = in.nextLine();

        System.out.print("Tangan Bagas: ");
        String pemainbagas = in.nextLine();

        int scoreabu = 0, scorebagas = 0;
        for (int i = 0; i <= pemainabu.length(); i += 2) {
            if(pemainabu.charAt(i)=='G'&&pemainbagas.charAt(i)=='B'
                    ||pemainabu.charAt(i)=='K'&&pemainbagas.charAt(i)=='G'
                    ||pemainabu.charAt(i)=='B'&&pemainbagas.charAt(i)=='K' ){
                scorebagas++;
            }
            else if(pemainabu.charAt(i)=='B'&&pemainbagas.charAt(i)=='G'
                    ||pemainabu.charAt(i)=='G'&&pemainbagas.charAt(i)=='K'
                    ||pemainabu.charAt(i)=='K'&&pemainbagas.charAt(i)=='B' ) {
                scoreabu++;
            }
        }
        if (scoreabu==scorebagas) {
            System.out.println("Seri");
        } else if (scoreabu>scorebagas) {
            System.out.println("Abu");
        }else {
            System.out.println("Bagas");
        }
    }
}
