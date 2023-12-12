import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Air Temperature : ");
        int heat = input.nextInt();

        if (heat < 5 ){
            System.out.println("You can go to Skiing");
            }else if (( heat >= 5) && (heat < 10)) {
            System.out.println("You can go to the cinema");
            }else if ((heat >= 10) && (heat <= 15 )){
            System.out.println("You can go the picnic or you can go to the cinema. It's up to you ");
            }else if ((heat > 15 ) && (heat <= 25)) {
            System.out.println("You can go the picnic");
            }else {
            System.out.println("You can go swimming. Welcome to the summer!!");
        }

    }
}