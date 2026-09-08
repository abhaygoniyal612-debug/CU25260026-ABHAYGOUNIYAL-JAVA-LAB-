import java.util.Scanner;

class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int first = num / 10000;
        int last = num % 10;

        if (first == last) {
            System.out.println("First and last digits are same");
        } else {
            System.out.println("First and last digits are not same");
        }

        sc.close();
    }
}