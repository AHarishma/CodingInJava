
public class Star {

	public static void main(String[] args) {
		int n=26;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
		System.out.println();
			
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(k);
			}
			for(int l=n-1-i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
