package AssignmentNo3;
import java.util.Scanner;

public class ArrArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		int n = sc.nextInt();
		System.out.println("Enter the no. of columns :");
		int m = sc.nextInt();
		int r,c;
		int arr[][] = new int[n][m];
		int arr1[][] = new int[n][m];
		System.out.println("Enter the values of first matrix");
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				arr[r][c] = sc.nextInt();
			}
			
		}
		System.out.println("Enter the values of second matrix");
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				arr1[r][c] = sc.nextInt();
			}
			
		}
		System.out.println("Sum of given two matrices is : ");
		int sum = 0;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				sum= arr[r][c]+arr1[r][c];
				System.out.print(" "+sum);
			}
			System.out.println("\n");
		}
		System.out.println("Sum of given two matrices is : ");
		int sub = 0;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				sub= arr[r][c]-arr1[r][c];
				System.out.print(" "+sub);
			}
			System.out.println("\n");
		}
	}

}
