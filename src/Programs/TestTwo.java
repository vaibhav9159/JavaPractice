package Programs;

public class TestTwo {
	
	/* 123
	 * 456
	 * 780
	 */


	public static void main(String[] args) {
		
	    int ab [][] = {{1,2,3},{4,5,6},{7,8,0}};
	    int min = ab[0][0];
	    int mincol = ab[0][0];
	    
	    for(int i = 0;i<ab.length;i++)
	    {
	    	for(int j =0; j<ab.length;j++)
	    	{
	    		if(ab[i][j]<min)
	    		{
	    			min=ab[i][j] ;
	    			  mincol = j;
	    		}
	    	}
	    	
	    } System.out.println("min value = " +min);
	    System.out.println("min col = " +mincol);
		
	int k = 0;
	int max = ab[0][mincol];
	for(int l=0;l<ab.length;l++)
	{
		if(ab[k][mincol]>max)
		{
			max = ab[k][mincol];
			
		}
		k++;
	}System.out.println("max  = " +max);
	
	}
	
	
}
