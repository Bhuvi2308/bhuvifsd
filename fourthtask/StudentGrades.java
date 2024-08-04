package fourthtask;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

	private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Grade of " + name + " is: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades sg = new StudentGrades();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String name;
        int grade;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    grade = scanner.nextInt();
                    sg.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    sg.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    name = scanner.nextLine();
                    sg.displayGrade(name);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        
    }
}