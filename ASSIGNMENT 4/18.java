class ElectricBill {
    int units;
    static double fixedCharge = 100;

    void calculateBill() {
        int usedUnits = units;
        double bill;

        if (usedUnits <= 100)
            bill = usedUnits * 5;
        else if (usedUnits <= 200)
            bill = usedUnits * 7;
        else
            bill = usedUnits * 10;

        double totalBill = bill + fixedCharge;

        System.out.println("Units: " + usedUnits);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();

        int u = 150;
        e.units = u;

        e.calculateBill();
    }
}