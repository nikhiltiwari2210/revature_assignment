package task5;

import java.util.Scanner;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,l,j,n,c=0,max=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array length");
		n=sc.nextInt();
		int arr[]= new int[n];
		l=arr.length;
		System.out.println("Enter duplicate Elements in array");

		for(i=0;i<l;i++){
			arr[i]=sc.nextInt();
		}
		int a[]=new int[n];
		for (i=0;i<l;i++) {
			for(j=0;j<l;j++) {
				if(arr[i]!=arr[j]) {
					a[c]=arr[i];
						c++;
		}
	}
			for(i=0;i<a.length;i++) {
			System.out.println(a[i]);}
		
}
}
}

