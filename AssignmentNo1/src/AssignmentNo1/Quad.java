package AssignmentNo1;
import java.lang.Math;



public class Quad {
	
	double posfact(int a, int b, int c) {
		int d= (b*b)-(4*a*c);
		double s= Math.sqrt(d);
		return (-b+s)/(2*a);
	}
	
	double negfact(int a, int b, int c) {
		int d= (b*b)-(4*a*c);
		double s= Math.sqrt(d);
		return (-b-s)/(2*a);
	}
	
	public static void main(String[] args)
	{
		Quad qd= new Quad();
		int a=6;
		int b=-18;
		int c=-3;
		System.out.println("Positive factor of given equation is:"+qd.posfact(a, b, c));
		System.out.println("Negative factor of given equation is:"+qd.negfact(a, b, c));
	}
}
