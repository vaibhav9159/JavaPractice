package Tricky;

public class StarPyramidOne {

	public static void main(String[] args) {

				
		System.out.println("~~~~~~~~~~~~~~~~");
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
