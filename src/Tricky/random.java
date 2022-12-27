package Tricky;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class random  {
	
	static int a = 12345;
	static int b = 1991;
	static String s = "shiva";
	static String arr [] = {"Bharat mata ki jai", "bhole baba","bhole baba","vande mataram","vande mataram","vande mataram","jai hind"};
	static int num[] = {-1,0,1,2,3,5};
	
	public static int findMissingNumber(int arr[])
	{
		int temp = 0;
		int temp1 = 0 ;
		for(int i=0;i<arr.length;i++)
		{
			temp = temp+arr[i];
		}
		for(int i=-1;i<=5;i++)
		{
			temp1 = temp1+i;
		}
		
		int num = temp1-temp;
		System.out.println("Missing num = " + num);
		return num;
	}
	
	public static boolean vowels(String s)
	{
		return  s.toLowerCase().matches(".*[aeiou]*.");
		 
	}
	
	public static boolean isVowel(char t)
	{
		return t == 'a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}
	
	public static void getVowelCount(String s)
	{	
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(isVowel(s.charAt(i)))
			{
				count++;
			}	
		}
		System.out.println(count + " = vowels count");
	}
	
	public static void swapNumbers()
	{
		int c = 0 ;
		a = b;
		b = c;
		c = a;
		System.out.println(a + " a and b are swapped " + b);
	}
	
	public static boolean isPrimeNumber(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;	
	}
	
	
	public static void getPrimeNumber(int n)
	{
		for(int i=2;i<=n;i++)
		{
			
		if(isPrimeNumber(i))
		{
			System.out.println(i + " is prime number");
		}
		
		}
	}
	
	public static void duplicateElement(String array[])
	{
		HashMap<String,Integer> map = new HashMap();
		
		for(String s:array)
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
		System.out.println("");
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " is the duplicate key");
			}
		}
		
	}
	
	public static void reverseStringInPattern()
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			for(int j=s.length()-1;j>=i;j--)
			{
			System.out.print(s.charAt(j) + "\t");
			}
			System.out.println();
		}
	}
	
	
	public static void reverseString()
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i) + "\t");
		}	System.out.println();
	}
		
	
	public static void pattern()
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print(s.charAt(j) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void patternStar()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				System.out.print("*" +"\t");
			}
			System.out.println();
		}		System.out.println("");
	}	
	
	public static void invertedStarpattern()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{	
				System.out.print("*" +"\t");
			}
			System.out.println();
		}	
	}
	
	public static void invertedStringPattern()
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length()-1;j>=i;j--)
			{
				System.out.print(s.charAt(j)+ "\t");
			}
			System.out.println();
		}
	}
	
	public static void reverseInteger()
	{	int rev;
		while(a!=0)
		{
			rev = a*0+a%10;
			a= a/10;
			System.out.print(rev);	
		}System.out.println("");
	}
	
	public static void tryCatchTest()
	{
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("airthmetic");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally 
		{
			System.out.println("finally");
		}
	}
	
	
	public static void main(String[] args) {
	
		
		reverseStringInPattern();
		System.out.println("");
		reverseString();
		System.out.println("");
		pattern();
		
		System.out.println("");
		
		patternStar();	
		
		invertedStarpattern();
		
		reverseInteger();
		
		tryCatchTest();
		
		duplicateElement(arr);
		
		swapNumbers();
		
		System.out.println(isPrimeNumber(-5));
		
		getPrimeNumber(7);
		
		System.out.println(vowels("Namaste"));
		
		getVowelCount(s);
		
		findMissingNumber(num);
	}

	
}