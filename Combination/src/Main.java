import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int n = scanner.nextInt();

        System.out.print("Enter the second number : ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0 || r > n ){
            System.out.println("Invalid input! n and r must be positive integers, and r must be less than or equal to n.");
        } else {
            int combination = 1;

            for (int i = 1; i <= r; i++ ){
                combination *= n--;
                combination /= i;
            }
            System.out.println("C(" + n + ", " + r + ") = " + combination);
        }
    }
}