import java.util.Scanner;

class Salary {
	float basic, da, hra, total;

	Salary(float basic) {
		this.basic = basic;
		hra = (float) (basic * 0.4);
		da = (float) (basic * 0.6);
		total = (basic + hra + da);
	}

}

public class Personal {
	String name, education;
	int age, experienceYears, basic, numberOfLoans, loanAmount, tax;
	Salary salary;

	Personal(String name, int age, String education, int experienceYears, int numberOfLoans, int basic,
			int loanAmount) {

		this.name = name;
		this.age = age;
		this.education = education;
		this.experienceYears = experienceYears;
		this.numberOfLoans = numberOfLoans;
		this.basic = basic;
		this.loanAmount = loanAmount;
		salary = new Salary(basic);

	}

	void isEligible() {
		if ((loanAmount <= salary.total / 2) && (numberOfLoans < 5))
			System.out.println("Is eligible for loan");
		else
			System.out.println("Not eligible for loan");
	}

	void taxPay() {
		if (salary.total < 250000)
			tax = 0;
		else if ((salary.total > 250000) && (salary.total < 500000))
			tax = (int) (0.1 * salary.total);
		else if ((salary.total > 500000) && (salary.total < 1000000))
			tax = (int) (0.2 * salary.total);
		else if (salary.total > 1000000)
			tax = (int) (0.3 * salary.total);

	}

	void isEligiblePromotion() {
		if (experienceYears > 10)
			System.out.println("Eligible for promotion ");
		else
			System.out.println("Not eligible for promotion");
	}

	void Display() {
		System.out.println("name: " + name);
		System.out.println("age :" + age);
		System.out.println("education :" + education);
		System.out.println("Years of Experience: " + experienceYears);
		System.out.println("Number of Loans: " + numberOfLoans);
		System.out.println("Salary: " + salary.total);
		isEligible();
		System.out.println("The tax to be paid is " + tax);
		isEligiblePromotion();
		System.out.println("\n\n\n");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of employees to be created");
		int num = scanner.nextInt();
		Personal employees[] = new Personal[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the information for employee number " + (i + 1));
			System.out.println("Enter the name");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter the age");
			int age = scanner.nextInt();
			System.out.println("Enter Education");
			scanner.nextLine();
			String education = scanner.nextLine();
			System.out.println("Enter years of experience");
			int experienceYears = scanner.nextInt();
			System.out.println("Enter number of Loans");
			int numberOfLoans = scanner.nextInt();
			System.out.println("Enter the basic salary");
			int basic = scanner.nextInt();
			System.out.println("Enter the loan amount");
			int loanAmount = scanner.nextInt();
			employees[i] = new Personal(name, age, education, experienceYears, numberOfLoans, basic, loanAmount);
		}
		System.out.println("\n\n");
		for (int j = 0; j < num; j++) {
			System.out.println("This is employee number " + (j + 1) + "'s Information");
			employees[j].Display();
		}
		scanner.close();

	}
}