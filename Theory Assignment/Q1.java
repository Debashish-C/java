class Student {
    String name;
    int marks;
    char grade;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = assignGrade(marks);
    }

    char assignGrade(int m) {
        if (m >= 90) return 'A';
        else if (m >= 80) return 'B';
        else if (m >= 70) return 'C';
        else return 'D';
    }

    void display() {
        System.out.println(name + " - " + marks + " - Grade: " + grade);
    }
}

public class Q1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter input like: \"John:85 Mary:72 Raj:90\"");
            return;
        }

        String[] entries = args[0].split(" ");
        Student[] students = new Student[entries.length];

        for (int i = 0; i < entries.length; i++) {
            String[] parts = entries[i].split(":");
            students[i] = new Student(parts[0], Integer.parseInt(parts[1]));
        }

        for (Student s : students)
            s.display();
    }
}
