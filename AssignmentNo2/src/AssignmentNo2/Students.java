package AssignmentNo2;
import java.util.Scanner;;

public class Students {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int fs=0;
		System.out.println("Enter the marks for 1st subject(out of 100)");
		int a = sc.nextInt();
		System.out.println("Enter the marks for 2nd subject(out of 100)");
		int b = sc.nextInt();
		System.out.println("Enter the marks for 3rd subject(out of 100)");
		int c = sc.nextInt();
		System.out.println("Enter the marks for 4th subject(out of 100)");
		int d = sc.nextInt();
		System.out.println("Enter the marks for 5th subject(out of 100)");
		int e = sc.nextInt();
		System.out.println("Enter the marks for 6th subject(out of 100)");
		int f = sc.nextInt();
		int sum = a+b+c+d+e+f;
		float per= sum*100/600;
		
		if(a<=40) 
			{
				fs++;
			}
		if(b<=40) 
			{
				fs++;
			}
		if(c<=40) 
			{
				fs++;
			}
		if(d<=40) 
			{
				fs++;
			}
		if(e<=40) 
			{
				fs++;
			}
		if(f<=40) 
			{
				fs++;
			}
	
		if(fs>3)
			{
				System.out.println("Fail");
				System.out.println("Failed subject count: "+fs);
			}
		else if(fs>0 && fs<=3)
			{
				System.out.println("KT");
				System.out.println("Failed subject count: "+fs);
			}
		else 
			{
				System.out.println("Pass");
			}
	}
}
