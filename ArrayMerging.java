package assignment2;

import java.util.Scanner;

class ArrayMerging {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of first and second array elements:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int n3=n1+n2;
		int c[]=new int[n3];
		System.out.println("Enter the first array elements:");
		for(int i=0;i<n1;i++)
		{
			 a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the second array elements:");
		for(int i=0;i<n2;i++)
		{
			 b[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<n2;i++)
		{
			c[n1+i]=b[i];
		}
		System.out.println("Array after Merging:");
		for(int i=0;i<n3;i++)
		{
			System.out.println(c[i]);
		}
	}

}
