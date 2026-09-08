class QUES19 {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {

            int temp = num;
            int digits = 0;

            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }

            temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;

                int power = 1;
                for (int i = 1; i <= digits; i++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}