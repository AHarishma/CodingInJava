import java.math.BigInteger;
public class FactorialSumOf100 {
	public static BigInteger fact(int num) 
	   {  
	            BigInteger f =new BigInteger("1");
		for (BigInteger i = BigInteger.valueOf(1);
	                i.compareTo(BigInteger.valueOf(num)) <= 0;
	                i = i.add(BigInteger.ONE)) 
		{
			f=f.multiply(i);
		}
		System.out.println(f);
		return f;
	   }
		public static void main (String[] args) throws java.lang.Exception
		{   BigInteger sum=new BigInteger("0");
		   
			BigInteger n=fact(100);
			while(n.compareTo(BigInteger.ZERO)!=0)
			{
				sum=sum.add(n.remainder(BigInteger.valueOf(10)));
				n=n.divide(BigInteger.valueOf(10));
			}
			System.out.println(sum);
		}
}
