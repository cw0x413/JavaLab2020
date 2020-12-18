public class Personal {
    private String eduString, nameString;
    private int age, expyears, loansN;
    private float loanAmount;

    private enum salaryEnum {
        basic, dra, hra
    };

    Personal(String eduString, String nameString, int age, int expyears, int loansN, float loanAmount,salaryEnum) {
        this.eduString = eduString;
        this.nameString = nameString;
        this.age = age;
        this.expyears = expyears;
        this.loansN = loansN;
        this.loanAmount = loanAmount;
    }

    public static void main(String[] args) {
        Personal personal=new Personal("placeholder", "placeholder", 10, 20, 432, 3.4f);
    }
}
