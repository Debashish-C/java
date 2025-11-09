abstract class EmployeePS {
    String name;
    double baseSalary;
    
    public EmployeePS(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    abstract double calculateSalary();
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class ManagerPS extends EmployeePS {
    double bonus;
    
    public ManagerPS(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class ClerkPS extends EmployeePS {
    double overtimePay;
    
    public ClerkPS(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

class SalespersonPS extends EmployeePS {
    double commission;
    int sales;
    
    public SalespersonPS(String name, double baseSalary, double commission, int sales) {
        super(name, baseSalary);
        this.commission = commission;
        this.sales = sales;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + (commission * sales);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        EmployeePS[] employees = {
            new ManagerPS("John", 50000, 15000),
            new ClerkPS("Alice", 30000, 5000),
            new SalespersonPS("Bob", 25000, 100, 50)
        };
        
        for (EmployeePS emp : employees) {
            emp.displayInfo();
            System.out.println("-------------------");
        }
    }
}