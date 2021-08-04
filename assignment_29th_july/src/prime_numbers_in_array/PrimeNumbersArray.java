package prime_numbers_in_array;

public class PrimeNumbersArray {
	
	public static void main(String[] args) {
	
		int arr[]= {12,91,37,2,191,41,19};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
	static boolean isPrime(int a)
	{
		boolean b=true;
		if(a==2)
		{
			b=true;
		}
		else
		{
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		}
		return b;
	}
}
//Find all prime numbers in array