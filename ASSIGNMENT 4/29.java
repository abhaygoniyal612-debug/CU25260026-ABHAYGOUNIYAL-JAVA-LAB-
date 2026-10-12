class Employee {
    String name;
    double salary;

    static String organization = "ABC Company";

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        String name1 = "Rahul";
        double salary1 = 40000;

        String name2 = "Aman";
        double salary2 = 50000;

        e1.name = name1;
        e1.salary = salary1;

        e2.name = name2;
        e2.salary = salary2;

        double firstSalary = e1.salary;
        double secondSalary = e2.salary;

        System.out.println("Organization: " + organization);

        if (firstSalary > secondSalary)
            System.out.println(e1.name + " has higher salary.");
        else if (secondSalary > firstSalary)
            System.out.println(e2.name + " has higher salary.");
        else
            System.out.println("Both employees have equal salary.");
    }
}