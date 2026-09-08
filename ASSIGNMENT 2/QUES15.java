import java.util.Scanner;

class QUES15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Number of set bits: " + count);

        sc.close();
    }
}