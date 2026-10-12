class Factorial {
    static int totalCalls = 0;

    void calculate(int number) {
        int n = number;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial of " + n + " = " + factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        int num = 5;
        f.calculate(num);

        System.out.println("Total Calls: " + totalCalls);
    }
}