package first;
import java.util.Scanner;

public class QueueDemo {

	int start = 0, end = -1, val;
	int size = 5;
	int[] que = new int[5];
	
	void push(int value)
	{
		if(isFull()==1)
		{
			System.out.println("Queue is Full");
		}
		else {
			end++;
			que[end] = value;
			display();
		}
	}
	
	void pop()
	{
		if(isEmpty()==1)
		{
			System.out.println("Queue is Empty");
		}
		else {
			start++;
			display();
		}
	}
	 
	int isFull()
	{
		if(end == (size-1))
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	
	int isEmpty()
	{
		if(end==-1)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	
	void display()
	{
		if(isEmpty()==1)
		{
			System.out.println("Queue is empty");
		}
		else {
			for(int i=start;i<=end;i++)
			{
				System.out.println(""+que[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String ch = "y";
		int ch1;
		QueueDemo qu = new QueueDemo();
		
		while(ch.equals("y"))
		{
			System.out.println("1.Push \n2.Pop \n3.Print");
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your choice : ");
			ch1 = sc.nextInt();
			
			switch(ch1)
			{
				case 1:
				{
					int n;
					System.out.println("Enter the element to push : ");
					n = sc.nextInt();
					qu.push(n);
					break;
				}
				
				case 2 :
				{
					qu.pop();
					break;
				}
				case 3 :
				{
					qu.display();
					break;
				}
				
				default:
				{
					System.out.println("Wrong choice...!");
					break;
				}
			}
			System.out.println("Do you want to perform the operations again?(y/n) : ");
			ch = sc.next();
		}
	}
}

