package DataTypes;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String s[][] = new String[2][3];
		s[0][0] = "shiva";
		s[0][1] = "shakti";
		s[0][2] = "vibhuti";
		s[1][0]= "shambhu";
		s[1][1]= "bhole";
		s[1][2]= "shambhavi";
		
		System.out.println("total rows = "+ s.length );
		System.out.println("total columns = "+ s[0].length);
		
		for(int row=0;row<s.length;row++)
		{
			for(int col=0;col<s[row].length;col++)
			{
				System.out.println(s[row][col] );
			}
		}

		
	}

}
