package AssignmentNo1;
import java.util.Scanner;

public class Swapping {

	void swap(int a, int b)
	{
		
		//using third var
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("A="+a);
		System.out.println("B="+b);	
	}
	
	public static void main(String[] args)
	{
		Swapping sp = new Swapping();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for A:");
		int A = sc.nextInt();
		System.out.println("Enter the value for B:");
		int B = sc.nextInt();
		System.out.println("values of A and B before Swapping are:");
		System.out.println("A="+A);
		System.out.println("B="+B);	
		System.out.println("values of A and B after Swapping are:");
		sp.swap(A, B);
	}
}
