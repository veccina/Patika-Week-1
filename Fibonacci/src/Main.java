import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan sayı girişi alıyoruz.
        System.out.print("How many elements will be in the Fibonacci series? : ");
        int number = inp.nextInt();

        //Alınan sayıya göre seriyi oluşturuyoruz.
        int a = 0, b = 1;
        System.out.print("Fibonacci serie : " + a + ", " + b);

        for (int i = 2 ; i < number ; i++){
            int total = a + b;
        //Kullanıcıdan alınan sayıya göre seriyi toplamlarını alacak şekilde yazdırıyoruz.
            System.out.println(a + " + " + b + " = " + total);
            a = b;
            b = total;
        }

    }
}