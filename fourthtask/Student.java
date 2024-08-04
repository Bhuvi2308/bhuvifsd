package fourthtask;


class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
	
	private int rollNo;
    private String name;
    private int age;
    private String course;

public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = validateName(name);
        this.age = validateAge(age);
        this.course = course;
    }
    private int validateAge(int age) throws AgeNotWithinRangeException {
        if (age >= 15 && age <= 21) {
            return age;
        } else {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }
    }

    private String validateName(String name) throws NameNotValidException {
        if (name.matches("[A-Za-z\\s]+")) {
            return name;
        } else {
            throw new NameNotValidException("Name is not valid, it should not contain numbers or special symbols");
        }
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
    }
    
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "bhuvana", 20, "Computer Science");
            System.out.println("Student created successfully: " + student1);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        // Testing invalid age
        try {
            Student student2 = new Student(2, "mohan", 22, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        // Testing invalid name
        try {
            Student student3 = new Student(3, "John123", 19, "Physics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    
   }