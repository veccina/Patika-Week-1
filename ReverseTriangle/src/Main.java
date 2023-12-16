import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Scanner sınıfını dahil edip kullanıcıdan giriş istiyoruz.

        System.out.print("Enter a number for the triangle's height : ");
        int height = inp.nextInt();

        //Ters üçgeni yazdırmak için for döngüsü kullanıyoruz

        for (int i = 0 ; i < height ; i++ ) {

        //Sol taraf boşlukları için denklemi kuruyoruz.
            for (int a = 0; a < i; a++) {
                System.out.print(" ");
            }
        //Yıldızların yazdırılması için ters üçgen denklemini kuruyoruz.

            for (int b = 0; b < (2 * (height - i)) - 1; b++) {
                System.out.print("*");
            }
        //Satırları tamamlayıp alta inmesi için sout komutunu kullanıyoruz.
            System.out.println();
        }
    }
}