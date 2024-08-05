package AssignmentNo2;
import java.util.Scanner;

public class Arithswitch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
		System.out.println("Choose the operation you want perform on the entered numbers");
		int ch = sc.nextInt();
		int sum,sub,mul;
		float div, mod;
		switch(ch)
		{
			case 1:
				sum = a+b;
				System.out.println("Addition is:"+sum);
				break;
				
			case 2:
				sub = a-b;
				System.out.println("Subtraction is:"+sub);
				break;
				
			case 3:
				mul = a*b;
				System.out.println("Multiplication is:"+mul);
				break;
				
			case 4:
				div = a/b;
				System.out.println("Division is:"+div);
				break;
				
			case 5:
				mod = a%b;
				System.out.println("Remainder is:"+mod);
				break;
				
			default:
				System.out.println("Entered choice is not valid");
				
		}
		
	}
}
