import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double a;
        double pi;
        pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println(" Enter the r : ");
        r = inp.nextInt();
        System.out.println(" Enter the central angle of the circle : ");
        a = inp.nextDouble();
        double area = (pi * (r * r) * a);
        System.out.println(" Area of the circle segment : " + area);
    }
}