import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;
        Scanner input = new Scanner(System.in);

        System.out.print("The number raised to the power of second number : ");
        n = input.nextInt();

        System.out.print("Second number : ");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k; i++) {

            while (i <= k) {
                total *= n;
                i++;
            }
            System.out.println("The answer : " + total);

        }
    }
}