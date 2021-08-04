package highest_letter;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello hi how are you doing";
		//String s1=printHighest(s);
		printHighest(s);
	}
	public static void printHighest (String s) {
		// TODO Auto-generated method stub
		String[] arr=s.split(" ");
		int max=0, c=0;
		for(int i=0;i< arr.length;i++) {
			c=arr[i].length();
			if(c>max)
				max=c;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i].length())
				System.out.println(arr[i]);
		}
	}
}


// monday quiz taken by vinay 02-08-2021