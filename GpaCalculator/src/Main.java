import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, phy, chem, turkish, hist, mus;

        Scanner inp = new Scanner(System.in);

        System.out.print("Your Math Grade : ");
        math = inp.nextInt();

        System.out.print("Your Physics Grade : ");
        phy = inp.nextInt();

        System.out.print("Your Chemistry Grade : ");
        chem = inp.nextInt();

        System.out.print("Your Turkish Grade : ");
        turkish = inp.nextInt();

        System.out.print("Your History Grade : ");
        hist = inp.nextInt();

        System.out.print("Your Music Grade : ");
        mus = inp.nextInt();

        int total = (math + phy + chem + turkish + hist + mus);
        double outcome = total / 6.0;
        boolean cond1 = outcome >= 60;
        String str = cond1 ? "Passed" : "Failed";
        System.out.println(outcome);
        System.out.println(str);
    }
}