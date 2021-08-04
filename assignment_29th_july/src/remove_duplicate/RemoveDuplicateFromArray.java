package remove_duplicate;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {22,21,47,33,224,85,22,72,47,74};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		removeDuplicates(arr);

	}
	static void removeDuplicates(int arr[])
	{
		int n= arr.length;
		if(n==0||n==1)
		{
			System.out.println(Arrays.toString(arr));
		}
		else
		{
			int j=0;
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]!=arr[i+1])
				{
				  arr[j++]=arr[i];
				}
			}
			arr[j++]=arr[n-1];
			System.out.println("Removed duplicated numbers");
			for(int i=0;i<j;i++)
			{
			System.out.print(arr[i]+" ");
			}
		}
	}
}
//Take an array and remove all duplicates in it

