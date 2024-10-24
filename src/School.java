import java.util.List;

public class School {

    // List to store all teachers in the school.
    private List<Teacher> teachers;

    // List to store all students in the school.
    private List<Student> students;

    // Static variable to keep track of the total money earned by the school.
    private static int totalMoneyEarned;

    // Static variable to keep track of the total money spent by the school.
    private static int totalMoneySpent;

    /**
     * Constructor to initialize the School object with a list of teachers and students.
     * Sets the initial total money earned and spent to 0.
     * @param teachers the list of teachers in the school.
     * @param students the list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Gets the list of teachers in the school.
     * @return the list of teachers.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a new teacher to the school's list of teachers.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Gets the list of students in the school.
     * @return the list of students.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school's list of students.
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Gets the total money earned by the school.
     * @return the total money earned.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Updates the total money earned by the school.
     * Adds the specified amount to the current total.
     * @param MoneyEarned the amount of money to add to the total money earned.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * Gets the total money spent by the school.
     * @return the total money spent.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Updates the total money spent by the school.
     * Deducts the specified amount from the total money earned,
     * which represents the expenses, such as salaries paid to teachers.
     * @param moneySpent the amount of money spent by the school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
