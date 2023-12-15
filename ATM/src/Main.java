import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int attempt = 3;
        int balance = 1500;
        int select;

        while (attempt > 0) {
            System.out.print("Username : ");
            userName = inp.nextLine();

            System.out.print("Password : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("You have entered successfully ! Welcome to the Kodluyoruz Bank !");
                break;
            } else {
                attempt--;
                System.out.println("Wrong username or password. Your attempts left :  " + attempt);
                if (attempt  == 0) {
                    System.out.println("Your account has been blocked, please contact with The Kodluyoruz Bank.");
                    return;
                }
            }
        }
                do {
                    System.out.println("Please select the action you would like to perform : ");
                    System.out.println("\n1- Deposit \n" +
                            "2- Withdrawal \n" +
                            "3- Balance Check \n" +
                            "4- Exit");
                    System.out.print("Your choice : ");
                    select = inp.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Amount : ");
                            int deposit = inp.nextInt();
                            balance += deposit;
                            break;

                        case 2:
                            System.out.print("Amount : ");
                            int withdrawal = inp.nextInt();
                            if (withdrawal > balance) {
                                System.out.print("Insufficient Funds.");
                            } else {
                                balance -= withdrawal;
                            }
                            break;
                        case 3:
                            System.out.print("Your balance : " + balance + ". ");
                            break;
                        case 4:
                            System.out.print("See you next time !!");
                            break;

                        default:
                            System.out.print("ınvalid choice. Please try again!!");
                    }
                }while (select != 4);

    }
}


