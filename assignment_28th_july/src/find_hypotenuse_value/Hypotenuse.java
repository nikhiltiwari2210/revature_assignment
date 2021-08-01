package find_hypotenuse_value;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		float c=0;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=(float)Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
		System.out.println("Hypotenuse c is "+ c);
	}
}
/* Given a right angle triangle with sides a, b and c. 
 * As per Pythagoras theorem the hypotenuse side c can be calculated as square root
 * of a square plus b square. Write a program to compute the hypotenuse, when a and 
 * b are provided.
 */
