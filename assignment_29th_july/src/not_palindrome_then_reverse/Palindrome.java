package not_palindrome_then_reverse;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String f="";
		for(String x:arr) {
			f=f+ isPallindrome(x)+" ";
		}
		System.out.println(f);
	}
	static String isPallindrome(String s)
	{
		if(isP(s))
		{
			return s;
		}
		else
		{
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			return sb.toString();
		}
	}
	public static boolean isP(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
	}
}
// In every word if it is not palindrome then reverse it and print back the whole sentence.