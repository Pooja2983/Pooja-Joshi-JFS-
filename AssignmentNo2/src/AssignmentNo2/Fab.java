package AssignmentNo2;
import java.util.Scanner;

public class Fab {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you to want to find the Fibonacci series");
		int n = sc.nextInt();
		int p=1,r=0,i=0;
		while(p<=n)
		{
			i=p;
			p=p+r;
			r=i;
			System.out.println(p);
		}	
	}
}
