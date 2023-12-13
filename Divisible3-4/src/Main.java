import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int i = 1;

        while (i <= n) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        if (count == 0) {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        } else {
            double average = (double) sum / count;
            System.out.println("Ortalama: " + average);
        }

        scanner.close();
    }
}