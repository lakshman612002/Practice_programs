package projects;

import java.util.Scanner;

public interface CityBank {
    void withdraw(int amount);

    void deposit(int amount);

    void balanceEnquiry();

    void services();

}

class Bank implements CityBank {

    int balance = 0;
    static Bank account = null;
    String name;
    double phone;

    double accountNumber;

    Bank(String name, double phone, int initialDeposit, double accountNumber) {
        this.name = name;
        this.phone = phone;
        balance += initialDeposit;
        this.accountNumber = accountNumber * 1000;
    }

    static void accountCreationAndServices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Details required for account creation");
        System.out.print("Enter your name:\t");
        // String escape = sc.nextLine();
        // sc.skip(escape);
        String name = sc.nextLine();
        System.out.print("enter your phone number:\t");
        double phone = sc.nextDouble();
        System.out.print("enter initial amount to be deposited in your account:\t");
        int initialDeposit = sc.nextInt();
        double accountNumber = Math.random();
        account = new Bank(name, phone, initialDeposit, accountNumber);
        System.out.println("your account is created");
        account.services();

    }

    public void services() {
        boolean service = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Account Holder Name:\t" + account.name + " \t Account Number is:\t" + (int) account.accountNumber);
        while (service) {

            System.out.println("Acoount services available:");
            System.out.println("1.Balance Enquiry");
            System.out.println("2.Money Withdraw");
            System.out.println("3.Deposit");
            System.out.print("Choose your option:\t");
            int option = sc.nextInt();

            switch (option) {
                case 1 ->
                    account.balanceEnquiry();

                case 2 -> {
                    System.out.print("Enter amount to withdraw:\t");
                    int amount = sc.nextInt();
                    account.withdraw(amount);
                }

                case 3 -> {
                    System.out.print("Enter the amount to deposit:\t");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                }

                default -> {
                    System.out.println("Given option is not appropriate.Please try aganin!");
                    continue;
                }

            }

            while (true) {
                System.out.print("Do you want to continue for fruther services:Yes(1)/No(0)-\t");
                int opinion = sc.nextInt();
                if (opinion == 0 || opinion == 1) {
                    if (opinion == 0) {
                        service = false;
                    }
                    break;
                } else {
                    System.out.println("This option is not appropriate.Please try again!");
                    continue;
                }

            }

        }

    }

    public void balanceEnquiry() {
        System.out.println("Your account balance is:\t" + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit is successful");
        // System.out.println("Your account toatal balance is:\t" + balance);

    }

    public void withdraw(int amount) {
        if (amount > balance) {
            int required = amount - balance;
            System.out.println("Withdraw not possible,because your requested amount is " + amount
                    + " rupees ,but your account contain " + balance + " rupees only. " + required
                    + " rupees less for the transaction.");
        } else {
            balance -= amount;
            System.out.println("Withdraw Transaction successful.");
            System.out.println("Your account  remaning balance is:\t" + balance);
        }
    }

    public static void main(String[] args) {
        // account = new Bank("Mr.K.Madhu", 7396540181d, 500, 46d);

        Scanner sc = new Scanner(System.in);
        int accountant;
        while (true) {
            System.out.print("Do you have account in this Bank:Yes(1)/No(0)-\t");
            accountant = sc.nextInt();
            if (accountant == 0 || accountant == 1) {
                break;
            } else {
                System.out.println("Given option is not appropriate.Please try again!");
                continue;
            }
        }
        if (accountant == 0) {
            accountCreationAndServices();

        } else {
            if (account == null) {
                System.out.println("There is no existing account in this session right now.You have to create account");
                accountCreationAndServices();
            } else {
                account.services();
            }
        }
        System.out.println("Thank for visiting our bank");

    }

}
