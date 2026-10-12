class Rectangle {
    int length;
    int breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        int area = length * breadth;

        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        int l = 10;
        int b = 5;

        r.length = l;
        r.breadth = b;

        r.calculateArea();
    }
}