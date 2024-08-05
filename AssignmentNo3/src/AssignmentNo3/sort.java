package AssignmentNo3;

import java.util.Scanner;

public class sort {
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i=0,j=0;
		int max= 0;
		System.out.println("Enter the array elements : ");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
	
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					max= arr[i];
					arr[i] = arr[j];
					arr[j]= max;
				}
			}
		}
		System.out.print("Array in ascending order is : \n[");
		
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");
		
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					max= arr[i];
					arr[i] = arr[j];
					arr[j]= max;
				}
			}
		}
		System.out.print("\nArray in descending order is : \n[");
		
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.print(" ]");
	}
}
