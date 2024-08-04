package fourthtask;


class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

public class Voter {

	private String voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(String voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter("123A", "bhuvi", 25);
            System.out.println("Voter created: " + voter1.getName() + ", Age: " + voter1.getAge());

            Voter voter2 = new Voter("111B", "MOHAN", 17);  // This will throw an exception
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}