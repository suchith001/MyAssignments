package homeassignments.week3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] i= {1,4,3,2,8,6,7};
		Arrays.sort(i);
		for(int j=1;j<=i.length-1;j++)
		{
			if(j!=i[j-1])
			{
				System.out.println(j);
				break;
			}
		}
		
		
		

	}

}
