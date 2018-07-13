
public class ReverseWithoutSplChar {
   private static  boolean isAlpha(char c)
   {
	   return (c>='A'&&c<='Z'||c>='a'&&c<='z');
   }
   private static String reverse(String str) {
	 char[] arr=str.toCharArray();
	 int l=0;
	 int r=arr.length-1;
	 while(l<r)
	 {
	 if(!isAlpha(arr[l]))
	 {
		 l++;
	 }
	 if(!isAlpha(arr[r]))
	 {
		 r--;
	 }
	  if(isAlpha(arr[l])&&isAlpha(arr[r]))
	  {
		  char temp=arr[l];
		  arr[l]=arr[r];
		  arr[r]=temp;
		  l++;
		  r--;
	  }
	 }
	 
	 return new String(arr);
   }
	public static void main(String[] args) {
		
		System.out.println(reverse("232dfhtrh"));
	}

}
