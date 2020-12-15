package day2;

public class stack {
    int top;
    int[] STACK;

    stack() {
        top = -1;
        STACK = new int[100];
    }

    void push(int data) {
        STACK[++top] = data;
    }

    int pop() {
        return STACK[top--];
    }

    void display() {
        System.out.println("Displaying");
        for (int i = 0; i <= top; i++) {
            System.out.println(STACK[i]);
        }
    }

    public static void main(String[] args) {
        stack Stack = new stack();
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        System.out.println("popped " + Stack.pop());
        Stack.display();
        Stack.push(70);
        Stack.push(80);
        Stack.push(90);
        Stack.push(100);
        Stack.display();
    }
}