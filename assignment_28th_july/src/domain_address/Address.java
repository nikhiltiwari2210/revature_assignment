package domain_address;

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