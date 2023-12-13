import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int total = 0;

        do {
            System.out.print("Enter a number : ");
            i = scan.nextInt();
            if ((i % 2 == 0) && (i % 4 == 0)) {
                total += i;
            }
        } while (i % 2 !=1);

        System.out.println("Total : " + total);
    }
}