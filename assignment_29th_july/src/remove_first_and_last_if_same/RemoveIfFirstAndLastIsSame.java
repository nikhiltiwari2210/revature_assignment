package remove_first_and_last_if_same;

public class RemoveIfFirstAndLastIsSame {
	
	public static void main(String [] args)
	{
		int arr[]= {1,2,3,101,304,567,899678};
		for(int i=0;i<arr.length;i++)
		{
			if(isLastAndFirstDigitSame(arr[i])!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	static boolean isLastAndFirstDigitSame(int a)
	{
		boolean b=false;
		String s=a+"";
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=true;
		}
		return b;
	}
}
// eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
//* so output will be [344,699] 