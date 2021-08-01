package quadrilateral_using_inheritance;

import java.util.Scanner;

public class AreaOfQuadrilateral {

	static double AreaOfQuadrilateral(double l, double b)
	{
		return l*b;
	}
	static double AreaOfQuadrilateral(double s)
	{
		return s*s;
	}
	static double AreaOfQuadrilateral(double a,double b,double h )
	{
		return(a+b)* h/2;
	}
	
	public static void main(String[] args)
	{
		System.out.println("1 for Rectangle\n2 for Sqaure\n3 for Trapezium\nEnter the value:");
			
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n== 1)
		{
			System.out.println("Enter length value: ");
			double l=sc.nextDouble();
			System.out.println("Enter breadth value: ");
			double b=sc.nextDouble();
			System.out.print("Area of Rectangle is ");
			System.out.println(AreaOfQuadrilateral(l,b));
		}
		else if(n== 2)
		{
			System.out.println("Enter side Value: ");
			double s=sc.nextDouble();
			System.out.println("Area of Square is ");
			System.out.println(AreaOfQuadrilateral(s));
		}
		else if(n== 3)
		{
			System.out.println("length of one parallel side: ");
			double l=sc.nextDouble();
			System.out.println("length of another parallel side: ");
			double b=sc.nextDouble();
			System.out.println("Height of trapezium: ");
			double h=sc.nextDouble();
			System.out.println("Area of Trapezium is ");
			System.out.println(AreaOfQuadrilateral(l,b,h));
		}
		else
			System.out.println("You have entered the Wrong value !!!!!!");
	}
}