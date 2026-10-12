class Triangle {
    double a, b, c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkTriangle() {
        double side1 = a;
        double side2 = b;
        double side3 = c;

        if (side1 + side2 > side3 &&
            side2 + side3 > side1 &&
            side1 + side3 > side2) {

            System.out.println("Valid Triangle");

            if (side1 == side2 && side2 == side3)
                System.out.println("Equilateral");
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");

        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        double x = 5;
        double y = 5;
        double z = 6;

        t.a = x;
        t.b = y;
        t.c = z;

        t.checkTriangle();
    }
}