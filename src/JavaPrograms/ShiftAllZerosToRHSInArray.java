package JavaPrograms;

import java.util.Arrays;

public class ShiftAllZerosToRHSInArray {

	public static int[] shiftZeros(int a[])
	{
		if(a.length==1)
		{
			return a;
		}
		
		int[] newarr = new int[a.length];
		int count = 0;
		for(int num:a)
		{
			if(num!=0)
			{
				newarr[count] = num;
				count++;
			}
		}
		return newarr;
		
	}
	
	
	public static void main(String[] args) {
		
		int i[] = {1,0,2,0,3,4,5,6,0,7};
		System.out.println(Arrays.toString(shiftZeros(i)));
		
		
	}

}
