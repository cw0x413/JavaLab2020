package day7;

import day7.ISE.*;

public class MainClass {
    public static void main(String[] args) {
        ISE_department ise_department = new ISE_department();
        try {
            ise_department.readdata();
        } catch (Exception e) {
            System.out.println(e);
        }
        ise_department.number_research_consultancy_projs();
        ise_department.print_number_designations();
        ise_department.printdata();
    }
}
