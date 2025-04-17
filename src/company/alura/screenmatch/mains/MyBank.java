package company.alura.screenmatch.mains;

import java.util.Scanner;

public class MyBank {
    public static void main(String[] args) {
        myClient();
    }

    private static void myClient() {
        String client = "Tony Stark";
        double balance = 1699.0;
        String accountType = "current account";
        System.out.println("*************************************************\n");
        System.out.println("Client: " + client);
        System.out.println("Account type: " + accountType);
        availableBalance(balance);
        System.out.println("\n*************************************************\n");

        String menu = """
                *** Enter the desired option ***
                1.- Consult Balance
                2.- Withdraw Balance
                3.- Deposit
                9.- Exit
                """;
        while (true) {

            int option = entryInt(menu);

            switch (option) {
                case 1:
                    availableBalance(balance);
                    break;
                case 2:
                    balance -= withdrawBalance(balance);
                    availableBalance(balance);
                    break;
                case 3:
                    balance += deposit();
                    availableBalance(balance);
                    break;
                case 9:
                    System.out.println("You´re Welcome");
                    return;
                default:
                    System.out.println("Invalid option, try again");
            }
        }
    }

    private static double deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the balance to deposit");
        double balanceToDeposit = scanner.nextDouble();
        if (balanceToDeposit > 0) {
            return balanceToDeposit;
        } else {
            System.out.println("Enter the positive value");
            return 0.0;
        }
    }

    private static double withdrawBalance(double balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the balance to withdraw");
        double balanceToWithdraw = scanner.nextDouble();

        if (balanceToWithdraw < balance && balanceToWithdraw > 0) {
            return balanceToWithdraw;
        } else {
            System.out.println(" ---> Insufficient balance <---");
            return 0.0;
        }
    }

    private static void availableBalance(double balance) {
        System.out.printf("Available Balance: $%.2f", balance);
        System.out.println();
    }

    private static int entryInt(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            int input = scanner.nextInt();

            try {
                return input;
            } catch (Exception e) {
                System.out.println("Invalid entry. Try again.");
            }
        }
    }
}
