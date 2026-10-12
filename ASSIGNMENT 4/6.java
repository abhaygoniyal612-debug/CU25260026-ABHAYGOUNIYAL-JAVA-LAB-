class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        String carBrand = brand;
        double carMileage = mileage;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car();

        String b = "Toyota";
        double m = 20.5;

        c.brand = b;
        c.mileage = m;

        c.display();
    }
}