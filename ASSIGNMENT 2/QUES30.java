import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check power of 4 using shift operators
        int temp = n;
        boolean powerOf4 = false;

        while (temp > 1 && (temp & 3) == 0) {
            temp >>= 2;
        }

        if (temp == 1)
            powerOf4 = true;

        System.out.println("Power of 4: " + powerOf4);

        // Toggle 3rd bit
        int result = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit: " + result);

        // Multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 10; i++) {

            int value = n * i;

            // Skip multiples of 6
            if (value % 6 == 0)
                continue;

            // Stop at multiples of 48
            if (value % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + value);
            sc.close();
        }
    }
}