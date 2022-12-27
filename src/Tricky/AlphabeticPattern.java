package Tricky;

public class AlphabeticPattern {

	public static void main(String[] args) {
		int count = 0;
	for(int i=0;i<=7;i++)
	{
		for(int j=0;j<=7;j--)
		{
			count++;
			System.out.print(count + "\t");
			
		}
		System.out.println();
	}
		int alpha = 65;
	for(int i=0;i<=5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			count++;
			System.out.print((char)(alpha+j) + " ");	
		}
		System.out.println();
	}
				
	}

}
