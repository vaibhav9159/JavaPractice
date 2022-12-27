package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter row");
		int row = sc.nextInt();
		
		System.out.println("Enter col");
		int col = sc.nextInt();
		System.out.println("Enter Matrix");
		int data [][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i][j]= sc.nextInt();
			}
		}
/*		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(data[i][j] +"\t");
			}System.out.println();
		}
	*/	
		// another way to print matrix
		for(int[] r:data)
		{
			System.out.println(Arrays.toString(r));
		}
		
		
	}

}
