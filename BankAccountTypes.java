// Base class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display the account type (general for BankAccount)
    public void displayAccountType() {
        System.out.println("This is a general bank account.");
    }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the constructor of the superclass BankAccount
        this.interestRate = interestRate;
    }

    // Override displayAccountType to specify Savings Account
    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account with interest rate: " + interestRate + "%.");
    }
}

// Subclass: CheckingAccount (inherits from BankAccount)
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the constructor of the superclass BankAccount
        this.withdrawalLimit = withdrawalLimit;
    }

    // Override displayAccountType to specify Checking Account
    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking Account with withdrawal limit: " + withdrawalLimit + ".");
    }
}

// Subclass: FixedDepositAccount (inherits from BankAccount)
class FixedDepositAccount extends BankAccount {
    double lockPeriod;

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, double lockPeriod) {
        super(accountNumber, balance); // Call the constructor of the superclass BankAccount
        this.lockPeriod = lockPeriod;
    }

    // Override displayAccountType to specify Fixed Deposit Account
    @Override
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account with lock period: " + lockPeriod + " months.");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        // Creating instances of each account type
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA12345", 1000, 2000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD12345", 10000, 12);

        // Displaying the account type for each
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}
