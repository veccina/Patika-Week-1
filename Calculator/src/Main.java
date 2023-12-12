import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        n1 = input.nextInt();
        System.out.print ("Please enter the second number : ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your Selection : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("This Addition Equals :"+ (n1 +n2));
                break;
            case 2:
                System.out.println("This Subtraction Equals :" + (n1 - n2));
                break;
            case 3:
                System.out.println("This Multiplication Equals :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("This Division Equals :" + (n1 / n2));
                }else if (n2 == 0 ) {
                    System.out.println("Numbers cannot be divided by zero");
                }
                break;
            default:
                System.out.println("You entered an incorrect value. Please enter a correct value between 1 to 4 ");
        }


    }
}