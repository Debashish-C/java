class PersonSI {
    String name;
    int age;
    
    public PersonSI(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class StudentSI extends PersonSI {
    int rollNo;
    String grade;
    
    public StudentSI(String name, int age, int rollNo, String grade) {
        super(name, age);
        this.rollNo = rollNo;
        this.grade = grade;
    }
    
    public void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        StudentSI student = new StudentSI("David", 19, 401, "A");
        student.displayStudent();
    }
}