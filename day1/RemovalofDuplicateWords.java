package Week3.day1;

public class RemovalofDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
        String[] words=text.split(" ");
        int count=0;
        for(int i=0;i<=words.length-1;i++)
        {	
        	for(int j=0;(j<=words.length-1) &(j!=i);j++)
            {
        	  if(words[i]==words[j])
        	  {
        		 count+=1;
        		 System.out.println(words[i]);
        		
        		
        	   }
        	 } 
        	  
            }
        }
	}
                 

