import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = inp.nextInt();

        System.out.print("Enter second number: ");
        int num2 = inp.nextInt();

        int a = num1;
        int b = num2;

        // EBOB hesaplama
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        int GCD = a;

        // EKOK hesaplama
        int LCM = (num1 * num2) / GCD;

        System.out.println("EBOB of " + num1 + " and " + num2 + " is: " + GCD);
        System.out.println("EKOK of " + num1 + " and " + num2 + " is: " + LCM);
    }
}