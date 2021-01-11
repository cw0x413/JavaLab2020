import java.util.Scanner;

class fibonacci {
    static int n;

    public static void main(String[] args) {
        int n0 = 0, n1 = 1;
        // without recursion
        enterData();
        System.out.println("Without recursion");
        for (int i = 0; i < 2 && i < n - 1; i++)
            System.out.println(i + " ");
        for (int i = 2; i < n; i++) {
            int temp = n0 + n1;
            n0 = n1;
            n1 = temp;
            System.out.println(n1);
        }
        // with recursion
        System.out.println("With recursion");
        for (int i = 0; i < n; i++)
            System.out.println(fibonacciWithRecursion(i));
    }

    static Scanner scanner = new Scanner(System.in);

    static int fibonacciWithRecursion(int n) {
        if (n <= 1)
            return n;
        return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
    }

    static void enterData() {
        System.out.println("Enter number of fibonacci terms to be generated");
        n = scanner.nextInt();
    }

}
