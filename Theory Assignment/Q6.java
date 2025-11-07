interface Student {
    void study();
}

interface Employee {
    void work();
}

class Person implements Student, Employee {
    public void study() {
        System.out.println("Person is studying.");
    }

    public void work() {
        System.out.println("Person is working.");
    }

    void showRole() {
        System.out.println("Person can be both Student and Employee.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Person p = new Person();
        p.study();
        p.work();
        p.showRole();
    }
}
