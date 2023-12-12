import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int a = scanner.nextInt();

        System.out.print("Enter the second value : ");
        int b = scanner.nextInt();

        System.out.print("Enter the third value : ");
        int c = scanner.nextInt();

        int result = a + b * c - b;
        System.out.print("Result :" + result);

        scanner.close();
    }
}