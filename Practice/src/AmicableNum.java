
public class AmicableNum {
	private static int amicable(int n)
	{   int sum=0;
		for(int i=1;i<n;i++)
			{if(n%i==0)
				sum+=i;}
		return sum;
	}
public static void main(String[] args) {
	int totalSum=0;
	int a=1;
	while(a<10000)
    {
		int b=amicable(a);	
		if(a!= b)
        {
			if(amicable(b)==a)
	    {totalSum+=a+b;
	  //  System.out.println(totalSum);
	     a=b;
	    // System.out.println(a);
	    }
        }
        	a++;
        
    }
System.out.println(totalSum);
}
}
