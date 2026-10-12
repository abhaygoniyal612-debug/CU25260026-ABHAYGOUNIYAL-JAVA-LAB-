class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            int next = first + second;

            System.out.print(first + " ");

            first = second;
            second = next;
        }

        seriesCount++;
        System.out.println();
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        int terms = 10;
        f.display(terms);

        System.out.println("Series Count: " + seriesCount);
    }
}