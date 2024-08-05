package AssignmentNo1;
import java.util.Scanner;


public class Circle {

	double area(int a)
	{
		return 3.14*a*a;
	}
	
	double circum(int a)
	{
		return 2*3.14*a;
	}
	
	public static void main(String[] args)
	{
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle:");
		int r = sc.nextInt();
		System.out.println("Area of circle is:"+c.area(r));
		System.out.println("Circumference of circle is:"+c.circum(r));
	}
}
