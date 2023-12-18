import java.util.Scanner;
public class Main {

   static boolean isPalindrom(int number){
       int temp = number, reverseNumber = 0, lastNumber;
       while (temp != 0) {
           lastNumber = temp % 10;
           reverseNumber = (reverseNumber * 10) + lastNumber;
           temp /= 10;
       }
       if (number == reverseNumber)
           return true;
       else
           return false;
   }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter a number to check if the number is palindrom : ");
        int digit = scan.nextInt();

        boolean sonuc = isPalindrom(digit);
        if (sonuc)
            System.out.println(digit + " is a palindrom number");
        else
            System.out.println(digit + " is not a palindrom number");
   }
}