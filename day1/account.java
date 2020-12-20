import java.util.Scanner;

public class account {
    int Accno;
    String name;
    long Phone_number;
    float balance = 0;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        name = sc.nextLine();
        System.out.println("Input Account number");
        Accno = sc.nextInt();
        System.out.println("Input phone number");
        Phone_number = sc.nextLong();
        System.out.println("Input balance");
        balance = sc.nextFloat();
    }

    float deposit(float amount) {
        System.out.println("Deposited " + amount + "\nBalance is " + (balance + amount));
        return balance += amount;
    }

    float withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw, Not enough balance (" + balance + ")");
            return Integer.MIN_VALUE - 1;
        }
        System.out.println("Withdrew " + amount + "\nBalance is " + (balance - amount));
        return balance -= amount;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Account number : " + Accno);
        System.out.println("Phone number : " + Phone_number);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account Account = new account();
        Account.getInput();
        int cAse = 10;
        while (cAse != 4) {
            System.out.println("Enter the case \n1)deposit\n2)withdraw\n3)display\n4)exit");
            cAse = sc.nextInt();
            if (cAse == 1) {
                System.out.println("Enter amount to deposit");
                float amount = sc.nextFloat();
                Account.deposit(amount);
            } else if (cAse == 2) {
                System.out.println("Enter amount to withdraw");
                float amount = sc.nextFloat();
                Account.withdraw(amount);
            } else if (cAse == 3) {
                Account.display();
            }
        }
    }
}