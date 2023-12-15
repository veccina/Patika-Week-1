
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan karşılaştırılacak toplam sayı istenir
        System.out.print("How many numbers will you enter ? : ");
        int n = inp.nextInt();

        //İlk sayı isteniyor.
        System.out.print("Enter the 1. number : ");
        int first = inp.nextInt();

        int min = first;
        int max = first;


        // Kullanıcının girdiği sayıları karşılaştır ve en küçük/en büyük sayıları bulur
        for ( int i = 2; i <= n; i++) {
            System.out.print("Enter the " + i + ". number : ");
            int current = inp.nextInt();

            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;

            }
        }

        // En küçük ve en büyük sayıları ekrana yazdırır.
        System.out.println("The smallest of all : " + min);
        System.out.println("The biggest of all : " + max);
    }
}