import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double pearkg, applekg, tomatokg, bananakg, eggplantkg, TotalAmount;
        double pearprice = 2.14, appleprice = 3.67, tomatoprice = 1.11, bananaprice = 0.95, eggplantprice = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print(" Enter the weight of the Pear : ");
        pearkg = inp.nextDouble();

        System.out.print(" Enter the weight of the Apple : ");
        applekg = inp.nextDouble();

        System.out.print(" Enter the weight of the Tomato : ");
        tomatokg = inp.nextDouble();

        System.out.print(" Enter the weight of the Banana : ");
        bananakg = inp.nextDouble();

        System.out.print(" Enter the weight of the Eggplant : ");
        eggplantkg = inp.nextDouble();

        TotalAmount = (pearkg * pearprice) + (applekg * appleprice) + (tomatokg * tomatoprice)
                + (bananakg * bananaprice) + (eggplantkg * eggplantprice);
        System.out.println("Total Amount : " + TotalAmount);
    }
}