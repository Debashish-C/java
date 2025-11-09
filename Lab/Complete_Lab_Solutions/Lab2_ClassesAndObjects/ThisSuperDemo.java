class PersonTS {
    String name;
    int age;
    
    public PersonTS(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class StudentTS extends PersonTS {
    int rollNo;
    
    public StudentTS(String name, int age, int rollNo) {
        super(name, age); // Calling superclass constructor
        this.rollNo = rollNo; // Using this for current class
    }
    
    @Override
    public void display() {
        super.display(); // Calling superclass method
        System.out.println("Roll No: " + this.rollNo);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        StudentTS student = new StudentTS("Charlie", 20, 301);
        student.display();
    }
}