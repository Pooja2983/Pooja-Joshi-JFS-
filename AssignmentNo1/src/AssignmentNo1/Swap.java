package AssignmentNo1;
import java.util.Scanner;

public class Swap {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of A");
	    int a=sc.nextInt();
	    System.out.println("Enter the value of B");
	    int b=sc.nextInt();
	    System.out.println("numbers before swapping:");
	    System.out.println("A = "+a);
	    System.out.println("B = "+b);
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("numbers after swapping:");
	    System.out.println("A = "+a);
	    System.out.println("B = "+b);
	}
}
