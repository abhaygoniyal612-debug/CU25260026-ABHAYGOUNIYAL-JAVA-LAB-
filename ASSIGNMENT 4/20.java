class BankAccount {
    double balance;
    static String bankCode = "ABC123";

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        double initialBalance = 10000;
        double amount = 3000;

        b.balance = initialBalance;

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Balance: " + b.balance);

        b.withdraw(amount);
    }
}