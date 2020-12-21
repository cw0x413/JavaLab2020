package day5;
import day5.Circle;
import java.util.Scanner;
public class driver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the the radius of circle");
		float radius=scanner.nextFloat();
		Circle circle=new Circle(radius);
		System.out.println("The area of the circle is "+circle.area());
		System.out.println("Enter the value of radian");
		float radian=scanner.nextFloat();
		Sector sector = new Sector(radius,radian);
		System.out.println("The area of the sector is "+sector.area());
		System.out.println("Enter the value of length");
		float length=scanner.nextFloat();
		Segment segment = new Segment(radius,length);
		System.out.println("The area of the Segment is "+segment.area());
		scanner.close();
	}
}