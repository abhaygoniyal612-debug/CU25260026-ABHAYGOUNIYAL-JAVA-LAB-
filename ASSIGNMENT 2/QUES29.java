import java.util.Random;

class Q29 {
    public static void main(String[] args) {

        Random r = new Random();

        while (true) {
            int num = r.nextInt(100) + 1;

            System.out.println("Generated: " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found!");
                break;
            }
        }
    }
}