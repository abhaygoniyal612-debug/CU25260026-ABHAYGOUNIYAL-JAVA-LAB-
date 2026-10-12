class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "COER University";

    void calculateAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();

        int m1 = 80;
        int m2 = 75;
        int m3 = 90;

        s.marks1 = m1;
        s.marks2 = m2;
        s.marks3 = m3;

        s.calculateAverage();
    }
}