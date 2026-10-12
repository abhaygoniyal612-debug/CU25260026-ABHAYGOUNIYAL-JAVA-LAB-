class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("Operating System: " + os);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();

        String b = "HP";
        int r = 8;

        l.brand = b;
        l.RAM = r;

        l.display();
    }
}