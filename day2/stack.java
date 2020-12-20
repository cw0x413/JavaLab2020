import java.util.Scanner;

public class stack {
    int top;
    int MAX = 100;
    int[] STACK;

    stack() {
        top = -1;
        STACK = new int[MAX];
    }

    void push(int data) {
        if (top < MAX - 1)
            STACK[++top] = data;
        else {
            System.out.println("Eh eh cant push stack overflow");
        }
    }

    int pop() {
        if (top != 0)
            return STACK[top--];
        return Integer.MIN_VALUE;
    }

    void display() {
        System.out.println("Displaying");
        for (int i = 0; i <= top; i++) {
            System.out.print(STACK[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stack Stack = new stack();
        int cAse = 10;
        while (cAse != 4) {
            System.out.println("Enter the case \n1)push\n2)pop\n3)display\n4)exit");
            cAse = scanner.nextInt();
            if (cAse == 1) {
                System.out.println("Enter a number to push");
                int x = scanner.nextInt();
                Stack.push(x);
            } else if (cAse == 2)
                System.out.println("popped " + Stack.pop());
            else if (cAse == 3)
                Stack.display();
        }
        scanner.close();
    }
}