class Calculator {
    static int operationsCount = 0;

    void add(int a, int b) {
        int result = a + b;
        operationsCount++;
        System.out.println("Addition = " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        operationsCount++;
        System.out.println("Subtraction = " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        operationsCount++;
        System.out.println("Multiplication = " + result);
    }

    void divide(int a, int b) {
        int result = a / b;
        operationsCount++;
        System.out.println("Division = " + result);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        int x = 20;
        int y = 5;

        c.add(x, y);
        c.subtract(x, y);
        c.multiply(x, y);
        c.divide(x, y);

        System.out.println("Total Operations = " + operationsCount);
    }
}