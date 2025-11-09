class StudentInfo {
    String name;
    int rollNumber;
    char grade;
    
    public StudentInfo(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo("Bob", 201, 'A');
        student.displayInfo();
    }
}