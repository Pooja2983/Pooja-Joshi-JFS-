package AssignmentNo2;

import java.util.Scanner;
public class StudentsArray {
	
	public static void main(String[] args)
	{
		//dt var[] = new dt[size];
		int marks[] = new int[6];
		int i; //loop counter
		int total=0,fs=0;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 subject marks(out of100)");
		for(i=0;i<6;i++)
		{
			marks[i] = sc.nextInt();
			total= total+marks[i];
		}
		per=(float)((total/600)*100);
		
		for(i=0;i<6;i++)
		{
			if(marks[i]<40)
			{
				fs=fs+1;
			}
		}
		if(fs>3)
		{
			System.out.println("Failed");
		}
		else if(fs>0 && fs<=3)
		{
			System.out.println("KT");
		}
		else
		{
			System.out.println("Passed");
		}
		
 	}
}
