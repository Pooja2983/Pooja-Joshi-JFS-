package AssignmentNo2;
import java.util.Scanner;

public class Power {

	public static void man(String[] args)
	{
		Scanner s =new Scanner(System.in);
		int p=1, i=0;
		System.out.println("Enter the value of base number");
		int a= s.nextInt();
		System.out.println("Enter the value of power number");
		int b= s.nextInt();
		
		while(i<b)
		{
			p=p*a;
			i++;
		}
		System.out.println(p);
	}
}
