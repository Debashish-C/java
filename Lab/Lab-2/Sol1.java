class Employee {
    public int id, salary;
    public String name; 

    // Constructor
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + this.name + " | ID: " + this.id + " | Salary: " + this.salary);
    }
}

public class Sol1 {
    public static void main(String[] args) {

        Employee a1 = new Employee(1, "Employee 1", 12000);
        Employee b1 = new Employee(2, "Employee 2", 2000);
        Employee c1 = new Employee(3, "Employee 3", 23200);

        a1.showDetails();
        b1.showDetails();
        c1.showDetails();
    }
}
