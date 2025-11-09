// Custom exception classes
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

class StudentMarksValidator {
    public static void validateMarks(int marks) throws NegativeMarksException, MarksOutOfRangeException {
        if (marks < 0) {
            throw new NegativeMarksException("Marks cannot be negative: " + marks);
        }
        if (marks > 100) {
            throw new MarksOutOfRangeException("Marks cannot exceed 100: " + marks);
        }
        System.out.println("Valid marks: " + marks);
    }
}

public class StudentMarksValidation {
    public static void main(String[] args) {
        int[] testMarks = {85, -5, 92, 105, 78};
        
        for (int marks : testMarks) {
            try {
                System.out.print("Validating marks " + marks + ": ");
                StudentMarksValidator.validateMarks(marks);
            } catch (NegativeMarksException e) {
                System.out.println("NegativeMarksException: " + e.getMessage());
            } catch (MarksOutOfRangeException e) {
                System.out.println("MarksOutOfRangeException: " + e.getMessage());
            }
        }
    }
}