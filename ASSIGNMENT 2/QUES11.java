import java.util.Scanner;

class StudentPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory marks (out of 100): ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical marks (out of 100): ");
        double practical = sc.nextDouble();

        double overall = (theory + practical) / 2;

        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        System.out.println("Overall Percentage: " + overall + "%");

        sc.close();
    }
}