// This class represents a Student with their ID, name, grade, and fee information.
public class Student {
    // Unique ID of the student.
    private int id;

    // Name of the student.
    private String name;

    // Current grade of the student.
    private int grade;

    // Total amount of fees that the student has paid.
    private int feePaid;

    // Total fees required to be paid by the student.
    private int feeTotal;

    // Constructor to initialize a new Student object with an ID, name, and grade.
    // Initially, feePaid is set to 0, and feeTotal is set to 10000.
    public Student(int id, String name, int grade) {
        this.id = id;             // Set the student's ID.
        this.name = name;         // Set the student's name.
        this.grade = grade;       // Set the student's grade.
        this.feePaid = 0;         // Initialize feePaid to 0.
        this.feeTotal = 10000;    // Set the default feeTotal to 10000.
    }

    // Getter method to get the student's ID.
    public int getId() {
        return id;
    }

    // Setter method to update the student's ID.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to get the student's name.
    public String getName() {
        return name;
    }

    // Setter method to update the student's name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the student's grade.
    public int getGrade() {
        return grade;
    }

    // Setter method to update the student's grade.
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Getter method to get the total fees paid by the student.
    public int getFeePaid() {
        return feePaid;
    }

    // Setter method to update the amount of fees paid by the student.
    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }

    // Getter method to get the total fee amount required for the student.
    public int getFeeTotal() {
        return feeTotal;
    }

    // Setter method to update the total fee amount required for the student.
    public void setFeeTotal(int feeTotal) {
        this.feeTotal = feeTotal;
    }
}
