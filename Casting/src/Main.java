import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner sınıfı dahil edildikten sonra kullanıcıdan int tipinde bir sayı isteniyor.
        System.out.print("Enter an integer : ");
        int intnumber = scanner.nextInt();

        //Kullanıcıdan bir ondalıklı sayı isteniyor.
        System.out.print("Enter a decimal number : ");
        double doublenumber =scanner.nextDouble();

        //Ondalıklı sayı integer sayı tipine dönüştürülüyor
        int autonarrow = (int) doublenumber;

        //Int sayı tipi ondalıklı sayıya dönüştürülüyor
        double explicitnarrow = (double) intnumber;

        //Tüm girişler ve çıktılar ekrana yazdırılıyor.
        System.out.println("Entered integer : " + intnumber);
        System.out.println("Entered decimal number : " + doublenumber);
        System.out.println("Integer converted to decimal : " + autonarrow);
        System.out.println("Decimal converted to integer : " + explicitnarrow);

    }
}