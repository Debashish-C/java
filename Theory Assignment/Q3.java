abstract class Account {
    String accNumber;
    double balance;

    Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void display() {
        System.out.println(accNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double minBalance = 500;

    SavingsAccount(String acc, double bal) {
        super(acc, bal);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance - amount >= minBalance)
            balance -= amount;
        else
            System.out.println("Cannot withdraw below minimum balance!");
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 1000;

    CurrentAccount(String acc, double bal) {
        super(acc, bal);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded!");
    }
}

public class Q3 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S101", 2000);
        s.withdraw(1700);
        s.display();

        CurrentAccount c = new CurrentAccount("C102", 1000);
        c.withdraw(1800);
        c.display();
    }
}
