package nth_max;

import java.util.Arrays;

public class MaxFromArray {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,l,n,max=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array length");
		n=sc.nextInt();
		int arr[]= new int[n];
		l=arr.length;
		System.out.println("Enter Array Elements");
		for(i=0;i<l;i++){
			arr[i]=sc.nextInt();
		}
		for (i=0;i<l;i++) {
			if(arr[i]>=max)
				max=arr[i];
		}
		System.out.println("Biggest Number in array is = "+max);

	}

}*/

//Find Nth  max in array, remember it will have duplicates
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {1,1,2,2,2,6,16,45,100,5};
	returnNthMax(arr,15);
	}
	static void returnNthMax(int[] arr, int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int countd=0;
		for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]!=arr[i+1])
				{
					countd++;
					if(countd==n)
					{
						System.out.println(arr[i]);
						break;
					}
				}
				if(i==arr.length-2)
				{
					System.out.println(arr[i+1]);
				}
		   }
	}

}