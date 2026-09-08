import java.util.Scanner;

public class QUES10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting year: ");
        int start = sc.nextInt();

        System.out.print("Enter ending year: ");
        int end = sc.nextInt();

        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                && year >= start && year <= end) {

            System.out.println(year + " is a leap year and is within the given range.");
        } else {
            System.out.println(year + " does not satisfy both conditions.");
        }

        sc.close();
    }
}