import java.util.Scanner;

public class QUES6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        int steps = 0;

        while (num >= 1) {
            num /= 2;
            steps++;
            System.out.println("After step " + steps + ": " + num);
        }

        System.out.println("Total number of steps: " + steps);

        sc.close();
    }
}