// Class to represent a Teacher with ID, name, and salary details
public class Teacher {
    // Unique ID for the teacher
    private int id;
    // Name of the teacher
    private String name;
    // Salary of the teacher
    private int salary;

    // Constructor to initialize a new teacher with their ID, name, and salary
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter method to retrieve the teacher's ID
    public int getId() {
        return id;
    }

    // Setter method to update the teacher's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to retrieve the teacher's name
    public String getName() {
        return name;
    }

    // Setter method to update the teacher's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the teacher's salary
    public int getSalary() {
        return salary;
    }

    // Setter method to update the teacher's salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
