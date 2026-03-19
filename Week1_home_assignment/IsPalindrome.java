package Week1_home_assignment;

public class IsPalindrome {
	
	public static void Palindromecheck(int input)
	{
		int output=0;
		for(int i=input;i>0;i=i/10)
		{
			int remainder=i%10;
			output=output*10+remainder;	
		}
		
		if (input==output)
		{
			System.out.println("Given number is a palindrome");
		}
		else
		{
			System.out.println("Given number is not a palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Palindromecheck(13456);
	}

}
