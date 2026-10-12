class BankAccount {
    long accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        long accNo = 123456789;
        double initialBalance = 5000;

        acc.accountNumber = accNo;
        acc.balance = initialBalance;

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + acc.accountNumber);

        double amount = 2000;
        acc.deposit(amount);
    }
}