package day1;
import java.util.Scanner;

public class account {
    int Accno;
    String name;
    long Phone_number;
    float balance=0;

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
       return balance+=amount;
    }

    float withdraw(float amount) {
        if (amount>balance)
            return Integer.MIN_VALUE-1;
        return balance-=amount;
    }

    public static void main(String[] args) {
        account Account = new account();
        Account.getInput();
        Account.deposit(2000);
        Account.withdraw(1000);
        System.out.println(Account.balance);
    }
}