package AssignmentNo2;
import java.util.Scanner;

public class Primein {

	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto to which you want the prime numbers");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			int c=0;
			for(j=1;j<=i;j++) 
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2) 
			{
				System.out.println(i);
			}
		}
	}
}
