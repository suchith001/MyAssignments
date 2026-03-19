package Week1_home_assignment;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
	    int c;
	    System.out.println(a);
	    System.out.println(b);
		for (int i=0;i<6;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		    			
		}

	}

}
