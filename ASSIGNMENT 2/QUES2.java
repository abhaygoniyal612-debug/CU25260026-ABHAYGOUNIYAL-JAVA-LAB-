import java.util.Scanner;

public class QUES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();
        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double compoundInterest = amount - principal;

        System.out.printf("Total Amount = %.2f%n", amount);
        System.out.printf("Compound Interest = %.2f%n", compoundInterest);

        sc.close();
    }
}

