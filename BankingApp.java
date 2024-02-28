import java.util.Scanner;

public class BankingApp 
{
    private static double balance = 0;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
	{
        boolean quit = false;
		
        while (!quit) 
		{
            printMenu();
            int choice = scan.nextInt();
            scan.nextLine(); 
            
            switch (choice) 
			{
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using the banking app!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scan.close();
    }

    public static void printMenu() 
	{
        System.out.println("\nWelcome to Simple Banking App");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }

    public static void deposit() 
	{
        System.out.print("Enter amount to deposit: ");
        double amount = scan.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public static void withdraw() 
	{
        System.out.print("Enter amount to withdraw: ");
        double amount = scan.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public static void checkBalance() 
	{
        System.out.println("Your balance is: " + balance);
    }
}
