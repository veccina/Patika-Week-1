import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remain;
        String horoscope = "";
        boolean isError = false;

        System.out.print("Please enter your year of birth : ");
        year = input.nextInt();
        remain = year % 12;

        switch (remain) {
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Rooster";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Rat";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Goat";
                break;
            default:
                isError = true;
        }if (isError){
            System.out.println("You entered wrong type of value !!");
        }else {
            System.out.println("Your Chinese Zodiac : " + horoscope);
        }

    }
}