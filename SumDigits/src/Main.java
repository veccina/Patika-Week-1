import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        num = input.nextInt();

        if (num <= 0 ){
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            int num2 = num;
            while (num2 > 0 ){
                int sum = num2 % 10;
                total += sum;
                num2 /= 10;
            }
            System.out.print("Total of the digits : " + total );
        }
    }
}