package starts_with;

import java.util.Scanner;

public class Starts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		if(s.startsWith("https"))
			System.out.println("Secured");
		else
			System.out.println("Not Secured");

	}

}

/* Given a website address as a string, find out if the website is secure or not. 
 * A website address starting with "http" is not secure and a website with "https" 
 * is secure.
 */