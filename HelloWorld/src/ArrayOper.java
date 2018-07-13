
public class ArrayOper {

	public static void main(String[] args) {
	int[] a= {1, 2, 3, 4, 5};
    int[] b={8, 5, 7, 6};
    int flag,sum=0,sum1=0;
    for(int i=0;i<a.length;i++) {
    	flag=0;
    	for(int j=0;j<b.length;j++) {
    		if(a[i]==b[j])
    		{
    			flag=1;
    			break;
    		}
    	}
    	if(flag==0)
    	{
    		if(a[i]%2==0)
    			sum+=a[i];
    		else
    			sum1+=a[i];
    	}
    		
    }
    System.out.println("Sum of even numbers "+sum);
    
    System.out.println("Sum of odd numbers "+sum1);
	}

}
