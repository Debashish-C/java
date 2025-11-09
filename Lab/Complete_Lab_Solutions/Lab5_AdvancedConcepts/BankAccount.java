class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
        notify(); // Notify waiting threads
    }

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw: " + amount);

        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Wait for deposit
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Withdraw thread interrupted");
                return;
            }
        }

        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

class DepositThread extends Thread {
    private final BankAccount account;
    private final int[] deposits;

    public DepositThread(BankAccount account, int[] deposits) {
        this.account = account;
        this.deposits = deposits;
        setName("DepositThread");
    }

    @Override
    public void run() {
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class WithdrawThread extends Thread {
    private final BankAccount account;
    private final int[] withdrawals;

    public WithdrawThread(BankAccount account, int[] withdrawals) {
        this.account = account;
        this.withdrawals = withdrawals;
        setName("WithdrawThread");
    }

    @Override
    public void run() {
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        int[] deposits = {500, 200, 300};
        int[] withdrawals = {900, 400, 500};

        Thread depositor = new DepositThread(account, deposits);
        Thread withdrawer = new WithdrawThread(account, withdrawals);

        // Start withdrawer first to demonstrate waiting
        withdrawer.start();
        depositor.start();

        try {
            withdrawer.join();
            depositor.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Banking demo finished.");
    }
}