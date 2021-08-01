package odd_middle_or_first_capital;

import java.util.Scanner;

public class Capital_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to perform the task");
		String s=sc.nextLine();
		System.out.println(convertMiddle(s));
        
	}
	static String convertMiddle(String s) {
		if(s.length()%2==0)
		{
			char a=s.charAt(0);
			return Character.toUpperCase(a)+s.substring(1,s.length());
		}
		else
		{
			int z=s.length()/2;
			char b=s.charAt(z);
			char c=Character.toUpperCase(b);
			return s.substring(0,s.length()/2)+c+s.substring(z+1);
		}
	}
}
//If the word is of odd length then convert middle letter to uppercase 
//else convert first letter to uppercase