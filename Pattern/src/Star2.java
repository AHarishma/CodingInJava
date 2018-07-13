
public class Star2 {
public static void main(String[] args) {
	int n=9;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
		System.out.print(" ");
		}
		for(int k=n+3-i;k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
