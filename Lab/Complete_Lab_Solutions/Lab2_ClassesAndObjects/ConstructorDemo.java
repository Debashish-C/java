class Student {
    String name;
    int rollNo;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.rollNo = 0;
    }
    
    // Parameterized constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); // Default
        Student s2 = new Student("Alice", 101); // Parameterized
        Student s3 = new Student(s2); // Copy
        
        s1.display();
        s2.display();
        s3.display();
    }
}