class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    void calculateGrade() {
        String studentName = name;
        int studentMarks = marks;
        char grade;

        if (studentMarks >= 90)
            grade = 'A';
        else if (studentMarks >= 75)
            grade = 'B';
        else if (studentMarks >= 60)
            grade = 'C';
        else if (studentMarks >= passingMarks)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();

        String n = "Abhay";
        int m = 82;

        s.name = n;
        s.marks = m;

        s.calculateGrade();
    }
}