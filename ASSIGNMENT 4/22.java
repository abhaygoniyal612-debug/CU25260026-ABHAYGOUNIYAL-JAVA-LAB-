class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is not an Armstrong Number");
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();

        int num = 153;
        a.check(num);

        System.out.println("Total Checks: " + totalChecks);
    }
}