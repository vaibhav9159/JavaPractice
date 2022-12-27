package Tricky;

public class LargestSmallestNumberInArray {

	public static void findLargestAndSmallestNum(int arr[])
	{
		int large = arr[0];
		int small = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large = arr[i];
			}
			else if(arr[i]<small)
			{
				small= arr[i];
			}
		}
		System.out.println("largest num = " +large +  "\n"+ " smallest num = " + small);	

	}
	
	public static void main(String[] args) {
		
		
	
		
		int a[] = {1,10000,-27,10,1000,7000};
		int large = a[0];
		int small = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large = a[i];
			}
			else if(a[i]<small)
			{
				small= a[i];
			}
		}
	//	System.out.println("largest num = " +large +  "\n"+ " smallest num = " + small);

		
		findLargestAndSmallestNum(a);
		
	}

}
