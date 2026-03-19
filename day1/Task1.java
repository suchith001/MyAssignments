package Week3.day1;

public class Task1 {

	public static void main(String[] args) {
		String s="fly me to the moon";
		
		char[] d=s.toCharArray();
		int count=0;
		for(int i=(d.length-1);d[i]!=' ';i--) {
			count=count+1;
			
			
			
		}

		System.out.println(count);
}
}