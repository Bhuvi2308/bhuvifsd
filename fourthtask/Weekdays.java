package fourthtask;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();

        try {
            System.out.println("The day is: " + weekdays[dayPosition]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day position. Please enter a number between 0 and 6.");
        }
        
        
    }
}