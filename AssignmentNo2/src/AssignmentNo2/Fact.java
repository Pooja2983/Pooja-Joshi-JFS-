package AssignmentNo2;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println("Factorial of given number is:"+fac);
	}
}
