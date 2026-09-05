import java.util.ArrayList;
import java.util.Scanner;

class StudentRecord {
    private int id;
    private String name;
    private double gpa;

    public StudentRecord(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | GPA: " + gpa;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StudentRecord> studentList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    studentList.add(new StudentRecord(id, name, gpa));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (StudentRecord s : studentList) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (StudentRecord s : studentList) {
                        if (s.getId() == searchId) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
