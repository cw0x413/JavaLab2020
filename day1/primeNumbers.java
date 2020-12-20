package day1;

public class primeNumbers {
    static int n;

    public static void main(String[] args) {
        enterData();
        System.out.println(isPrime(n));
    }

    static Scanner scanner = new Scanner(System.in);

    static boolean isPrime(int x) {
        int y = (int) Math.sqrt(x) + 1;
        for (int i = 2; i < y; i++)
            if (x % i == 0)
                return false;
        return true;
    }

    static void enterData() {
        System.out.println("Enter number to check");
        n = scanner.nextInt();
    }
}
