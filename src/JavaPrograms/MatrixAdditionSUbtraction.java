package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdditionSUbtraction {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter row");
		int row = sc.nextInt();
		System.out.println("ENter col");
		int col = sc.nextInt();

		int[][] matrix1 = new int[row][col];
		
		int[][] matrix2 = new int[row][col];
		
		int sum[][] = new int[row][col];
		
		System.out.println("ENter maxtri 1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("ENter maxtri 2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Print maxtri 1");
		for(int[] r:matrix1)
		{
			System.out.println(Arrays.toString(r));
		}
		System.out.println("Print maxtri 2");
		for(int[] r:matrix2)
		{
			System.out.println(Arrays.toString(r));
		}
		
		System.out.println("sum of 2 matrices");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j] =  matrix1[i][j] + matrix2[i][j];  // instead of + give - to subtract
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
