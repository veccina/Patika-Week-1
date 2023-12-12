import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        double area ;

        Scanner input = new Scanner(System.in);
        System.out.println("First side : ");
        a = input.nextInt();

        System.out.println("Second side : ");
        b = input.nextInt();

        System.out.println("Third side");
        c = input.nextInt();

        d = ( (a + b + c) / 2 );

        area = Math.sqrt(d * (d-a) * (d-b) * (d-c));
        System.out.println("Area of Triangle :" + area);
    }
}