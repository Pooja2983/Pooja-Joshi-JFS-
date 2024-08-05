package AssignmentNo1;
import java.util.Scanner;


public class Rectangle {

	int area(int a, int b)
	{
		return a*b;
	}
	
	int peri(int a, int b)
	{
		return 2*(a+b);
	}
	
	public static void main(String[] args) 
	{
	
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int l = sc.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int w = sc.nextInt();
		System.out.println("area of rectangle is:"+rec.area(l, w));
		System.out.println("perimeter of rectangle is:"+rec.peri(l, w));
		
	}
}
