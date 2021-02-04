package assignment2;

import java.util.Scanner;

class AdditionOf2DMatrix {

	public static void main(String[] args) {
		int rows, cols,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows = sc.nextInt();
		System.out.println("Enter the number columns");
		cols = sc.nextInt();
		 
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		int result[][] = new int[rows][cols];
		 
		System.out.println("Enter the elements of matrix1");
		for (i= 0;i<rows;i++)
		{ 
			for (j=0;j<cols;j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		for ( i=0;i<rows;i++)
		{
			for (j=0;j<cols;j++ )
			{
				matrix2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (i=0;i<rows;i++)
		{
			for (j=0 ;j<cols;j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j] ; 
			}
		}
		System.out.println("Sum of the matrices:");
		for(i=0;i<rows;i++)
		{ 
			for(j=0;j<cols;j++)
			{
				System.out.print(result[i][j]+"\t");
			}
		}
		 
		System.out.println();

	}

}
