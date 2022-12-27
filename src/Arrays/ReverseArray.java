package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {	
	
	public static void main(String[] args) {
		
		int arr[] = {7,6,5,4,3,2,1};
		int arr1[] = {27,16,51,11,32,200,10};
		reverseArray(arr);
		verifySortedOrder(arr);
		findMaxAndMinNumber(arr1);
	
	}
		
	public static void reverseArray(int array[])
	{
		int l = array.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		for(int i=0;i<n;i++)
		{
			temp = array[i];
			array[i]=array[l-i-1];
			array[l-i-1]=temp;
		}
		for(int e: array)
		{
			System.out.print(e + "\t");
		}
		System.out.println();
	}
	
	
	public static void verifySortedOrder(int array[])
	{
		boolean isSorted = true;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				isSorted=false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("Array is sorted");
		}
		else 
		{
			System.out.println("Array is not sorted");
		}
	}
	
	public static void findMaxAndMinNumber(int array[])
	{
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
			else if(array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.println("Max = " +max + " Min = " + min);
	}

}
