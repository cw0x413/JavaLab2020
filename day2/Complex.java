package day2;

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
            return Float.toString(real1 + real2) + "+i(" + Float.toString(imag1 + imag2)+")";
        else if (op == '-')
            return Float.toString(real1 - real2) + "+i(" + Float.toString(imag1 - imag2)+")";
        else if (op == '*')
            return Float.toString(real1 * real2 - imag1 * imag2) + "+i(" + Float.toString(real1 * imag2 + real2 * imag1)+")";
        return null;
    }

    public static void main(String[] args) {
        Complex complex = new Complex(1.45f, 32.36f, 42.354f, 53.45f);
        System.out.println(complex.operations('+'));
        System.out.println(complex.operations('-'));
        System.out.println(complex.operations('*'));
    }
}