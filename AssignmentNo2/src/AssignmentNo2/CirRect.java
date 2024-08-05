package AssignmentNo2;
import java.util.Scanner;

public class CirRect {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Circle\n2. Rectangle\nChoose the shape on which you want to perform the operation");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter the radius of circle:");
				int r = sc.nextInt();
				System.out.println("Choose the operation you want to perform on the Circle:\n1. Area of circle\n2. Circumference of the circle");
				int ch1 = sc.nextInt();
				switch(ch1)
				{
					case 1:
						float area = (float)3.14*r*r;
						System.out.println("Area of Circle is:"+area);
						break;
						
					case 2:
						float cir = (float)3.14*2*r;
						System.out.println("Circumference of Circle is:"+cir);
						break;
				}
				break;
				
			case 2:
				System.out.println("Enter the length of rectangle:");
				int l = sc.nextInt();
				System.out.println("Enter the width of rectangle:");
				int w = sc.nextInt();
				System.out.println("Choose the operation you want to perform on the Circle:\n1. Area of rectanglele\n2. Perimeter of the rectangle");
				int ch2 = sc.nextInt();
				switch(ch2)
				{
					case 1:
						float area = (float)l*w;
						System.out.println("Area of Rectangle is:"+area);
						break;
						
					case 2:
						float peri = (float)2*(l+w);
						System.out.println("Perimeter of Rectangle is:"+peri);
						break;
				}
				break;
				
			default:
				System.out.println("Entered choice is not valid");
		}
	}
}
