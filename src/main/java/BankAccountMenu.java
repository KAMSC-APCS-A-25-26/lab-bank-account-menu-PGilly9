import java.util.Scanner;
public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        double account = 0;
        while (run) {
            System.out.println("\n");
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice:  ");
            int input = scan.nextInt();
            System.out.print("\n");

            switch (input) {
                case 1:
                    System.out.print("How Much:  ");
                    double money = scan.nextInt();
                    account = account + money;
                    break;

                case 2:
                    System.out.print("How Much:  ");
                    money = scan.nextInt();
                    account = account - money;
                    break;

                case 3:
                    System.out.println("Your balance is " + account);
                    break;

                case 4:
                    run = false;
                    System.out.println("Goodbye!");
                    break;
            }

        }
    }
}