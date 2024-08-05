package AssignmentNo3;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number you are searching for in an array :");
		int a = sc. nextInt();
		int c = 0;
		for(int i=0;i<n;i++)
		{
			if(a==arr[i]) {
				c++;
			}
		}
		
		if(c==1)
		{
			System.out.println("Given element is present in array");
		}
		else
		{
			System.out.println("Given element is not present in array");
		}
	}

}
