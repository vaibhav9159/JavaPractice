package Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Random {

	
	public static void reverseString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev =  rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void removeJunkChars(String s)
	{
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
	
	public static void reverseInteger(int n)
	{
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void reverseIntegerusingBuffer(int n)
	{
		StringBuffer sf = new StringBuffer(String.valueOf(n));
		System.out.println(sf.reverse());	
	}
	
	public static int findMissingNumberInArray(int n, int arr[])
	{
		int expectedSum = n*((n+1)/2);
		int actualSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			actualSum=actualSum+arr[i];	
		}
		int missingNum= expectedSum - actualSum;
		System.out.println("missingNum is = "+ missingNum);
		return missingNum;
	}
	
	public static void findMissingNumberInArrayTwo(int arr[])
	{ 	int temp=0;
		int temp2=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=temp+arr[i];
		}
		System.out.println("Sum is = "+ temp);
		
		for(int j=-1;j<=7;j++)
		{
			temp2=temp2+j;
		}
		System.out.println("Sum two is = "+ temp2);
		int missingNum = temp2-temp;
		System.out.println("missingNum is = "+ missingNum);
	}
	
	public static void findDuplicateElementsInArray(String arr[])
	{
		HashMap <String,Integer> map = new HashMap();
		for(String s:arr)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> s:entrySet)
		{
			if(s.getValue()>1)
			{
				System.out.println(s.getKey()+ "  has " + s.getValue() + " duplicate values" );
			}
			else
			{
				System.out.println("no duplicate values for key " + s.getKey() );
			}
		}
		
	}
	
	public static void findLargestSmallestIntInArray(int arr[])
	{
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			else if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("largest num = " + max +  " and smallest is = " + min );
	}
	
	public static void swapNumbers(int a, int b)
	{
		int temp = 0;
		temp = a;
		a=b;
		b= temp;
		System.out.println("swapped without var,  a = "+ a + " b = "+ b);
	}
	
	public static void swapNumWithoutThirdVar(int a, int b)
	{
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("swapped a = "+ a + " b = "+ b);
	}
	
	public static void swapStrings(String a, String b)
	{
		String temp ="";
		temp = a;
		a=b;
		b= temp;
		System.out.println("swapped String  a = "+ a + " b = "+ b);
	}
	
	public static void swapStringsWithoutThirdVar(String a, String b)
	{
		a= a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("swapped String  without 3rd var a = "+ a + " b = "+ b);
	}
	
	public static boolean verifyPrimeNumbers(int a)
	{
			if(a<=1)
			{
			return false;
			}
			
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					return false;
				}
			}//System.out.println(a +" is a prime number");
			return true;		
	}
	
	public static void findPrimeNumbersInRange(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(verifyPrimeNumbers(i))
			{
				System.out.println(i +" is a prime number");
			}
		}
		
	}  
	
	public static void isPalindrome(int n)
	{
		int remainder = 0;
		int sum = 0;
		int t;
		t = n;
		while(n>0)
		{
			remainder = n%10;
			sum = sum*10+remainder;
			n = n/10;
		}
		if(t==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
	
	
	public static void main(String[] args) {
		String s = "Shiva Shakti";
		String s1 = "Shiva Shakti !@#$%&(*&)(*åΩƒ˙®¥¨˚†∆˙";
		String s2 = "shambhu";
		String s3 = "nath";
		int num = 12345;
		int array[] = {1,2,3,4,5,7};
		int array2[] = {-1,0,1,2,3,4,5,7};
		String names[] = {"Google" , "Google", "Amazon", "Bharat","Bharat","Bharat", "Shiva","Shiva","Shiva", "Shambhu"};
		int a = 100;
		int b = 200;
		
		//1
		reverseString(s);
		//2
		removeJunkChars(s1);
		//3
		reverseIntegerusingBuffer(num);
		reverseInteger(num);
		//4
		findMissingNumberInArray(7,array);
		findMissingNumberInArrayTwo(array2); // more robust method
		//5
		findDuplicateElementsInArray(names);
		//6
		findLargestSmallestIntInArray(array2);
		//7
		swapNumbers(a,b);
		swapNumWithoutThirdVar(a,b);
		//8
		swapStrings(s2,s3);
		swapStringsWithoutThirdVar(s2,s3);
		//9
		verifyPrimeNumbers(7);
		findPrimeNumbersInRange(7);
		//10
		isPalindrome(151);
		
	
	
	
	
	}

}
