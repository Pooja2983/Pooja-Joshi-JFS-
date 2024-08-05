package AssignmentNo3;
import java.util.Scanner;

public class Evenodd {

	private int n;
	private int arr[];
	
	public Evenodd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
	}
	
	public void OddSum()
	{
		Oddsum os = new Oddsum();
		int sum=os.sum(n, arr);
		
		System.out.println("Sum of odd elements in array is : "+sum);
	}
	
	
}
