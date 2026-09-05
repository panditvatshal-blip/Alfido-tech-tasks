// Parent Class demonstrating Inheritance
class Person {
    private String name; // Encapsulation: Private fields
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Method to be overridden (Polymorphism)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Child Class extending Person (Inheritance)
class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayRole() {
        System.out.println("Role: Student (ID: " + studentId + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Control structures, Loops, and Arrays
        int[] marks = {85, 92, 78, 90, 88};
        int sum = 0;

        System.out.println("--- Array & Loop Demo ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " Mark: " + marks[i]);
            sum += marks[i];
        }

        double average = (double) sum / marks.length;
        System.out.println("Average Mark: " + average);

        if (average >= 80) {
            System.out.println("Performance: Excellent");
        } else {
            System.out.println("Performance: Good");
        }

        System.out.println("\n--- OOP Concepts Demo ---");
        // Creating Objects
        Person person = new Person("Rahul", 30);
        Student student = new Student("Vatsal", 21, "ST1024");

        // Displaying details using encapsulation and polymorphism
        System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());
        person.displayRole();

        System.out.println("\nStudent Name: " + student.getName() + ", Age: " + student.getAge());
        student.displayRole();
    }
}
