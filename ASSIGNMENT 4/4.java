class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Pvt Ltd";

    void display() {
        int id = empId;
        double sal = salary;

        System.out.println("Company: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        int employeeId = 101;
        double employeeSalary = 35000;

        e.empId = employeeId;
        e.salary = employeeSalary;

        e.display();
    }
}