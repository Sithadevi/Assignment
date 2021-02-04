package assignment2;

import java.util.Scanner;

public class LargestAndSmallest
{
	public static void main(String args[])
	{
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements");
		n = sc.nextInt();
     	int a[] = new int[n];
     	System.out.println("Enter all the elements:");
     	for (int i=0;i<n;i++) 
     	{
     		a[i] = sc.nextInt();
     	}
     	for (int i=0;i<n;i++) 
     	{
     		for (int j = i + 1; j < n; j++) 
     		{
     			if (a[i] > a[j]) 
     			{
     				temp = a[i];
     				a[i] = a[j];
     				a[j] = temp;
     			}
     		}
     		System.out.print("After sorting:"+a[i]);
     	}
     	System.out.println("The first smallest number is:"+a[0]);
     	System.out.println("The second smallest number is:"+a[1]);
     	System.out.println("The first largest number is:"+a[n-1]);
     	System.out.println("The second largest number is:"+a[n-2]);
	}
}
