import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating teacher objects with their ID, name, and salary.
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Dany", 600);

        // Creating a list to store the teachers.
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        // Creating student objects with their ID, name, and grade.
        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Ramy", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        // Creating a list to store the students.
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        // Creating a school object with the list of teachers and students.
        School ghs = new School(teacherList, studentList);

        // Adding a new teacher, Megan, to the school's list of teachers.
        Teacher megan = new Teacher(6, "Megan", 900);
        ghs.addTeacher(megan);

        // Students pay their fees, which increases the total money earned by the school.
        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");

        // School pays salary to Lizzy, which decreases the total money earned.
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        // School pays salary to Vanderhorn, which further decreases the total money earned.
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        // Print details of Rakshith using the overridden toString() method in the Student class.
        System.out.println(rakshith);

        // School pays salary to Mellisa.
        mellisa.receiveSalary(mellisa.getSalary());

        // Print details of Mellisa using the overridden toString() method in the Teacher class.
        System.out.println(mellisa);
    }
}
