package AssignmentNo2;

public class Prime {

	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=100;i++)
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
