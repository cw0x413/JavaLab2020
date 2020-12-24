package day7.ISE;

import day7.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ISE_department implements Department {
    Scanner scanner = new Scanner(System.in);
    List<Faculty> facultylist = new ArrayList<Faculty>();

    @Override
    public void readdata() throws AgeException {
        System.out.println("Enter the number of employees");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Faculty faculty = new Faculty();
            System.out.println("Details of " + (i + 1));
            System.out.println("Enter the name of faculty member");
            scanner.nextLine();
            faculty.name = scanner.nextLine();
            System.out.println("Enter the age");
            faculty.age = scanner.nextInt();
            try {
                if (faculty.age > 58) {
                    throw new AgeException(faculty.age);
                }
            } catch (Exception e) {
                i--;
                System.out.println(e);
                continue;
            }
            System.out.println("Enter the years of experience");
            faculty.years_of_experience = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the designation");
            faculty.designation = scanner.nextLine();
            System.out.println("Enter the joining date");
            faculty.joiningDate = scanner.nextLine();
            System.out.println("Enter the subjects handled with spaces ");
            faculty.subjectsHandled = scanner.nextLine();
            facultylist.add(faculty);
        }
    }

    @Override
    public void printdata() {
        for (Faculty faculty : facultylist) {
            System.out.print("Name: " + faculty.name);
            System.out.println("Age: " + faculty.age);
            System.out.println("Years of Experience: " + faculty.years_of_experience);
            System.out.println("Designation: " + faculty.designation);
            System.out.println("Joining Date" + faculty.joiningDate);
            System.out.println("Subjects Handled" + faculty.subjectsHandled);
        }
    }

    @Override
    public void print_number_designations() {
        for (Faculty faculty : facultylist) {
            System.out.println(faculty.name + " has designation of " + faculty.designation);
        }
    }

    @Override
    public void number_research_consultancy_projs() {
        for (Faculty faculty : facultylist) {
            System.out.println(faculty.name + " has designation of " + faculty.designation);
        }
    }

    public static void main(String[] args) {
        ISE_department ise_department = new ISE_department();
        try {
            ise_department.readdata();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
