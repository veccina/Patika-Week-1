import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan sorgulama yapılacak sayıyı istiyoruz.
        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        int total = 0;

        // Sayının kendisi hariç pozitif tam sayı çarpanlarını buluyoruz.
        for (int i = 1 ; i < number; i++ ){
            if (number % i == 0){
                total += i;

            }
        }
        // Mükemmel sayı kontrolü yapıyoruz
        if (total == number){
            System.out.println(number + " is a perfect number.");
        }else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}