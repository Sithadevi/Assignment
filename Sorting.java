package assignment2;

import java.util.Scanner;

class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements of array:");
		int temp;
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
			
		}
		System.out.println("Array after sorting: ");

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);

		}
	}

}

