package Week3.day1;

public class Task2 {
	
	public  static boolean ispalindrome(String s)
{
   char[] d=s.toLowerCase().toCharArray();
		
		int l=d.length;
		int i=0;
		int j=l-1;
		while(i<j)
		{
			if (d[i]!=d[j])
			{	
				return false;
				
			}
			i++;
			j--;
		}
		return true;
}
	public static void main(String[] args) {
		System.out.println(ispalindrome("malayalam"));
		
}
					
			
	
		

}

