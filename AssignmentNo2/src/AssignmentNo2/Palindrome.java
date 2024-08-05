package AssignmentNo2;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		int n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		int rev=0,digit; 
		while(temp>0)
			{
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
			}
		if(rev==n)
			{
			System.out.println("Number is palindrome");
			}
		else
			{
			System.out.println("Number is not a palindrome");
			}
	}
}
