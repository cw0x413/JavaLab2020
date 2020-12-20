import java.util.Scanner;

public class Complex {
    float imag1, imag2, real1, real2;

    Complex(float real1, float imag1, float real2, float imag2) {
        this.real1 = real1;
        this.imag1 = imag1;
        this.real2 = real2;
        this.imag2 = imag2;
    }

    String operations(char op) {
        if (op == '+')
            return Float.toString(real1 + real2) + "+i(" + Float.toString(imag1 + imag2) + ")";
        else if (op == '-')
            return Float.toString(real1 - real2) + "+i(" + Float.toString(imag1 - imag2) + ")";
        else if (op == '*')
            return Float.toString(real1 * real2 - imag1 * imag2) + "+i(" + Float.toString(real1 * imag2 + real2 * imag1)
                    + ")";
        return null;
    }

    public static void main(String[] args) {
        Complex complex = new Complex(1.45f, 32.36f, 42.354f, 53.45f);
        Scanner scanner = new Scanner(System.in);
        int cAse = 10;
        while (cAse != 5) {
            System.out.println("Enter the case \n1)enter data\n2)add\n3)subtract\n4)multiply\n5)exit");
            cAse = scanner.nextInt();
            if (cAse == 1) {
                System.out.println(
                        "Enter two complex numbers with 4 values seperated by commas eg:- 4,1,3,2 denotes 4+i and 3+2i");
                String xString = scanner.next();
                int[] n = new int[4];
                String[] nStrings = xString.split(",", 4);
                for (int i = 0; i < 4; i++)
                    n[i] = Integer.parseInt(nStrings[i]);
                complex = new Complex(n[0], n[1], n[2], n[3]); // garbage collection will take care
                System.out.println("Value updated");
            } else if (cAse == 2)
                System.out.println(complex.operations('+'));
            else if (cAse == 3)
                System.out.println(complex.operations('-'));
            else if (cAse == 4)
                System.out.println(complex.operations('*'));
        }
        scanner.close();
    }
}