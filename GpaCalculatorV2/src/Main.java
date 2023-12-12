import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] lessons = {"Mathematics", "Physics", "Turkish", "Chemistry", "Music"};
        int toplamNot = 0;
        int dersSayisi = lessons.length;
        int gecmeNotu = 55;

        for (String lesson : lessons) {
            System.out.print(" Enter your " + lesson + (" grade : "));
            int not = input.nextInt();

            if (not >= 0 && not <= 100) {
                toplamNot += not;
            } else {
                System.out.println("Please enter valid grade. This grade will not be added to your GPA ");
                dersSayisi--;
            }
        }

        input.close();

        if (dersSayisi > 0) {
            double ortalama = (double) toplamNot / dersSayisi;
            System.out.println("GPA : " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Congratulations, you passed !");
            } else {
                System.out.println("You did not pass !! ");
            }
        } else {
            System.out.println("No valid grades were entered, it is not possible to calculate the GPA.");
        }
    }
}