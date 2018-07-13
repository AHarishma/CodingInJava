
public class SecMaxChar {
	 public static char secondMaxChar(char[] arr)
		{ 
		int[] alpha=new int[256];
		int val=0;
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		alpha[(int)arr[i]]++;	
		}
		for(int i=0;i<256;i++){
	            if(alpha[i]>0)
	            {
	            	if(alpha[i]>=max1)
	            	{
	            		max2=max1;
	            		max1=alpha[i];
	            	}
	            	else if(alpha[i]>max2)
	            		max2=alpha[i];
	            }
		}
		
		for(int k=0;k<256;k++){
		if(alpha[k]==max2)
		{
			val=k;
			break;
		}
			
		}
		return (char)(val);
		}
		public static void main (String[] args) throws java.lang.Exception
		{
			String str="Hi hello gooooddd eeeveeeningg";
			char[] arr=str.toCharArray();
			char res=secondMaxChar(arr);
			System.out.println(res);
		}
}
