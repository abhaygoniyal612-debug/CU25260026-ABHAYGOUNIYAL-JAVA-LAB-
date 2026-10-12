class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "ABC Bank";

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();

        double p = 10000;
        double r = 5;
        double t = 2;

        s.principal = p;
        s.rate = r;
        s.time = t;

        s.calculateInterest();
    }
}