package question1;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		
		String s1[]=s.split(" ");
		//System.out.println(Array.toString(s1));
		System.out.println(s1[2]);
		
		
	}

}

/*Given a website address as a string, extract the domain name.
 For example, if the website address is "https://en.wikipedia.org/wiki/Main_Page",
 then it should return "en.wikipedia.org" as the domain name.
 */