package highest_string;

import java.util.Arrays;
import java.util.Scanner;

public class HIghestString {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 String s =sc.nextLine();
		System.out.println(printHighest( s));
			}
		public static String printHighest(String s)
		{
			String arr[]=s.split(" ");
			int i,l=0;
			for(i=0;i<arr.length;i++)
			{
				if(arr[i].length()>l)
				{
					l=arr[i].length();
				}
				
			}
			String fina="";
			for(i=0;i<arr.length;i++)
			{
			 if(arr[i].length()==l)
			 {
				fina=fina+arr[i]+" ";
			 }
			}
			return fina;
	}

}
