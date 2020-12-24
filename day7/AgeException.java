package day7;

public class AgeException extends Exception {
    int age;

    public AgeException(int age) {
        this.age = age;
    }

    public String toString() {
        return age + " is more than 58";
    }
}
