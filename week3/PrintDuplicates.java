package homeassignments.week3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int [] num={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		for (int i=1;i<=num.length-1;i++) 
		{
		    if(num[i-1]==num[i])
		    {
		    	System.out.println(num[i]);
		    }
		}

	}

}
