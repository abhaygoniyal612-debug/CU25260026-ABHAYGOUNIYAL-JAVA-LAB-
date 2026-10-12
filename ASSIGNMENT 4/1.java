class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        String studentName = "Abhay";
        int studentAge = 20;

        s1.name = studentName;
        s1.age = studentAge;
        count++;

        s1.display();
    }
}