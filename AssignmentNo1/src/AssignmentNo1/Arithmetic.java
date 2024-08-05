package AssignmentNo1;
import java.util.Scanner;


public class Arithmetic {

	int sum(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	float div(int a, int b) {
		return a/b;
	}
	
	int mod(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args)
	{
		Arithmetic art = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		System.out.println("Sum of two numbers is:"+art.sum(num1, num2));
		System.out.println("Subtractionn of two numbers is:"+art.sub(num1, num2));
		System.out.println("Multiplication of two numbers is:"+art.mul(num1, num2));
		System.out.println("Division of two numbers is:"+art.div(num1, num2));
		System.out.println("Modulus of two numbers is:"+art.mod(num1, num2));
		
	}
}
