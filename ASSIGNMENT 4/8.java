class Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    void display() {
        String penColor = color;
        String penType = type;

          System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
    }

    public static void main(String[] args) {
        Pen p = new Pen();

        String c = "Blue";
        String t = "Ball Pen";

        p.color = c;
        p.type = t;

        p.display();
    }
}