package Week3.day1;

public class ChangestringToupper {

	public static void main(String[] args) {
		String s="changeme";
		char[] r=s.toCharArray();
		for(int i=0;i<=r.length-1;i++)
		{
		   if(i%2!=0)
		   {
			  System.out.print(Character.toUpperCase(r[i]));
		   }
		   else
		   System.out.print(r[i]);
		}
		

	}

}
