
public class Prime {

	private static boolean isPrime(long n){
		int l = (int)Math.sqrt(n);
	 for(int i=2;i<=l;i++)
    {
    	if(n%i==0)
    	{
    	return false;
    	}
    }
    return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{ long sum=0;
   for(long i=2;i<=2000000;i++)
   {
   	if(isPrime(i))
   	sum+=i;
   }
   System.out.println(sum);
	}
}
