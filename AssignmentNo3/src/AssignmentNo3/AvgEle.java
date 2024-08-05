package AssignmentNo3;

import java.util.Scanner;

public class AvgEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int sum= 0;
		float avg = 0;
		int arr[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
			avg = sum/n;
		}
		System.out.println("Average of all array elements is : "+avg);
	}

}
