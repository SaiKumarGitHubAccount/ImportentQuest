import java.util.Scanner;

public class ATMProgram {
    private static double balance = 1000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    withdrawMoney(amountToWithdraw);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double amountToDeposit = scanner.nextDouble();
                    depositMoney(amountToDeposit);
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    private static void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Unable to withdraw.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Current balance: $" + balance);
        }
    }

    private static void depositMoney(double amount) {
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
        System.out.println("Current balance: $" + balance);
    }
}