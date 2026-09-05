import java.util.*;

// Custom Exception Definition
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CollectionsAndExceptions {

    // Method throwing custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        } else {
            System.out.println("Registration successful. Age verified.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 1. DEMO: ArrayList ===");
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java"); // Duplicates allowed
        System.out.println("ArrayList Courses: " + courses);

        System.out.println("\n=== 2. DEMO: HashSet ===");
        Set<String> uniqueCourses = new HashSet<>(courses); // Removes duplicates
        System.out.println("HashSet Unique Courses: " + uniqueCourses);

        System.out.println("\n=== 3. DEMO: HashMap ===");
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        System.out.println("\n=== 4. DEMO: Try-Catch & Custom Exception ===");
        
        // Handling standard ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Standard Exception: Division by zero is not allowed.");
        }

        // Handling Custom Exception
        try {
            System.out.println("Testing checkAge(15)...");
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
