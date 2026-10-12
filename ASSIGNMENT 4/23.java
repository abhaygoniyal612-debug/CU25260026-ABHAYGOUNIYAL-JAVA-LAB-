class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int number) {
        boolean prime = true;

        if (number <= 1)
            prime = false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();

        int num = 17;
        p.check(num);

        System.out.println("Total Prime Checks: " + totalPrimeChecks);
    }
}