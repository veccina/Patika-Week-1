import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height;
        double weight;

        Scanner inp = new Scanner(System.in);

        System.out.print(" Enter your height(in meters) : ");
        height = inp.nextDouble();

        System.out.print(" Enter your weight (in kilograms) : ");
        weight = inp.nextDouble();

        double mass = (weight / (height * height) );
        System.out.println(" Your Body Mass Index :" + mass );
    }
}