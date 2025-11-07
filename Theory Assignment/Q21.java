import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class VotingSystem {
    static void register(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age " + age + " is not valid for voting!");
        else
            System.out.println("✅ Registration successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            register(age);
        } catch (InvalidAgeException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }
    }
}
