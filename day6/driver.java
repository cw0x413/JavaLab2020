package day6;
import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyTwoWheeler myTwoWheeler=new MyTwoWheeler(2000);
        System.out.println("Enter the year it was manufactured");
        myTwoWheeler.putData(scanner.nextInt());
        System.out.println("The car was manufactured in "+myTwoWheeler.getData());
        scanner.close();
	}
}
