import java.util.Scanner;;
public class Test {
	public static int prime(int n)
	{
		int flag=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			return n;
		return 0;
	}
	public static double powerNum(int x,int m)
	{
		int power=1;
		for(int i=1;i<=m;i++)
		{
			power*=x;
		}
		return power;
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int x=scanner.nextInt();
	double y=(double)x;
	int t=x;
	int k=scanner.nextInt();
	int count=0,n=2;
	while(count<=k-2)
	{
		int primeNo=prime(n);
		if(primeNo!=0)
		{
		if(count%2==0)
		y=y-(powerNum(t, primeNo)/primeNo);
		
		
		else
		y=y+(powerNum(t, primeNo)/primeNo);
		
		count++;
		}
		n++;
		
	}
	System.out.println(y);
	
	
}

}
