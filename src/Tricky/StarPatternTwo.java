package Tricky;

public class StarPatternTwo extends random{
int b ;

	public static void main(String[] args) {
				
		for(int i=0;i<=4;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("*" +"\t");
			}
			System.out.println();
		}		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<=4;i++)
		{
			for(int j =4;j>=i;j--)
			{
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
