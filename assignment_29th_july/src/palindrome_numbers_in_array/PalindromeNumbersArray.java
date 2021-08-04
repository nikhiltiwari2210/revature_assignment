package palindrome_numbers_in_array;

public class PalindromeNumbersArray {

	public static void main(String[] args) {
		
		int arr[]= {345,25,212,63,454,3553,67876,78};
		pallindrome(arr);
	}
	 static boolean isPallindrome(String s)
	 {
		 StringBuilder sb= new StringBuilder(s);
		 sb.reverse();
		 String s1=sb.toString();
		 return s1.equals(s);
	 }
	 static void pallindrome(int arr[])
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 if(isPallindrome(arr[i]+""))
				 System.out.print(arr[i]+" ");
		 }
	 }
}
//Find all the palindrome numbers in array