package last_letter_to_upper;

import java.util.Scanner;

public class LastLetterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to perform the task");
		String s=sc.nextLine();
		
		String[] arr=s.split(" ");
		String f="";
		
		for(String x:arr) {
			f=f+convertLast(x)+" ";
		}
		System.out.println(f);

	}
	static String convertLast(String s)
	{
		char c,c1;
		c=s.charAt(s.length()-1);
		c1=Character.toUpperCase(c);
		
		return s.substring(0,s.length()-1) + c1;
	}
}

//Convert every word's last letter to upper case