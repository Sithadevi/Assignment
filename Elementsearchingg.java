package assignment2;

import java.util.Scanner;

class Elementsearchingg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
     	for (int i=0;i<n;i++) 
     	{
     		a[i] = sc.nextInt();
     	}
     	System.out.println("Enter the serching element:");
		int n1=sc.nextInt();
		int count=0;
		int location=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==n1)
			{
				location=i+1;
				count=1;
				break;
			}
			else
			{
				count=0;
			}
		}
		if(count==1)
		{
			System.out.println("Loactn of the no.is: "+location);
		}
		else
		{
			System.out.println(-1);
		}

	}

}
