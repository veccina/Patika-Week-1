import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the year : ");
        int year = input.nextInt();
        boolean leapYear = false;

        if (year % 4 == 0){
            if ((year %100 !=0 || year %400 ==0)){
                leapYear = true;
            }
        }
        if (leapYear){
            System.out.println(year + " is a leapyear !! ");
        }else {
            System.out.println(year + " is not a leapyear. ");
        }

    }
}