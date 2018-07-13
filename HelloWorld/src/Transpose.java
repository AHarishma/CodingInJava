import static java.lang.System.out;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    for(int i=1;i<=a.length;i++)
    {   t=i;
    	out.print(t+" ");
    	  for(int j=1;j<=a.length-1;j++)
    	  {t=t+a.length;
    	out.print(t+" ");}
    	out.println();
    	
    	
    }
	}

}
