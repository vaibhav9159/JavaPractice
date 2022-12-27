package Tricky;

public class MissingNumbersInArray {

	public static void main(String[] args) {

		int num[] = {1,2,3,4,5,7};
		int num2[] = {-1,0,1,2,3,5};
		
		int i = findMissingNumber(num,7);
		System.out.println("missing num = "+i);
		findMissingNumTwo(num2);
		
		
		// find string length without using length method 1
		String s = "shiva";
		System.out.println("string lenth = "+s.toCharArray().length);
		
		// find string length without using length method 2
		int count = 0;
		for(char c:s.toCharArray())
		{
			count ++;
		}
		System.out.println("length of string = "+count);
		
		
	}
	
	public static int findMissingNumber(int num[],int totalSum)
	{
		int	expectedSum = totalSum*((totalSum+1)/2);
		int actualSum = 0;
		for(int n:num)
		{
			actualSum = actualSum + n;
		}
		return expectedSum - actualSum;
	}
	
	public static int findMissingNumTwo(int arr[])
	{
		int temp=0;
		int temp1=0;
		for(int i=0;i<arr.length;i++)
		{
			temp =temp+arr[i];
		}
		System.out.println("sum1 = " + temp);
		
		for(int i=-1;i<=5;i++)
		{
			temp1 =temp1+i;
		}
		System.out.println("sum1 = " + temp1);
		
		int missingNum=temp1 - temp;
		System.out.println("Missing num is = " + missingNum);
		return missingNum;
		
	}
	

}
