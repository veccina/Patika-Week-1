import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değer tanımlanıyor
        int n;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değer alınıyor ve 
        System.out.print("Enter a number : ");
        n = input.nextInt();
        System.out.println("Powers of 4 and 5 smaller than " + n + ":");

        // Denklem kuruluyor
        for (int i = 1, power4 = 4, power5 = 5; power4 <= n || power5 <= n; i++, power4 *= 4, power5 *= 5) {
            if (power4 <= n) {
                System.out.println("4^" + i + " = " + power4);
            }
            if (power5 <= n) {
                System.out.println("5^" + i + " = " + power5);
            }
        }
    }
}    