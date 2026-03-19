package Week1_home_assignment;

public class IsPrime {
	
	public static boolean primecheck(int n)
	{
		if (n<=1)
		    return false;
		if (n<=3)
			return true;
		if((n%2==0)||(n%3==0))
             return false;
        for(int i=5;i*i<=n;i+=6)//To check 6k+1 or 6k-1 values
        {
        	if(n%i==0||n%(i+2)==0)
        	  return false;
        
          
        }
		return true;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=32;
		System.out.println(num +" is prime?" + "\n"+primecheck(num));	

	}

}
