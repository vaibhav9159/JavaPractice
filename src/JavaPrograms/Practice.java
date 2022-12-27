package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice {

	public static void palindrome(int num)
	{
		int t;
		t = num;
		int r;
		int sum = 0;
		
		while(num>0)
		{
			r=num%10;
			sum =  sum*10+r;
			num = num/10;
		}
		
		if(t==sum)
		{
			System.out.println("palindrome = " + t);
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	
	public static boolean armStrong(int num)
	{
		int t;
		int r; 
		t= num;
		int cube = 0;
		
		while(num>0)
		{
			r = num%10;
			cube = cube + (r*r*r);
			num = num/10;
		}
		if(t==cube)
		{
		//	System.out.println("armstrong");
			return true;
		}
		else
		{
		//	System.out.println("not armstrong");
			return false;
		}
		
	}
	
	//armstrong number in range 
	public static void armStrongInRange(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(armStrong(i))
			{
				System.out.println("armstrong = " + i);
			}
		}
		
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		
		if(num==0)
		{
			return 1;
		}
		
	for(int i=1;i<=num;i++)
	{
		fact = fact*i;
		
	}
	System.out.println("factorial of " + num +" = " +fact);
	return fact;
	
	}
	
	public static void printDuplicateWords(String text)
	{
		text=text.toLowerCase();
		
		String [] words = text.split(" ");
		for(int i =0;i<words.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<words.length;j++)
			{ 	
				count++;
				if(words[i].equals(words[j]))
				words[j] = "0";
			}
		
		
		if(count>1 && words[i]!="0")
		{
			System.out.println(words[i] + " : " + count);  
		}
	}
}

	
	public static void printDuplicateWordsViaHashSet(String text)
	{
		
		text= text.toLowerCase();
		String [] strArr = text.split(" ");
		
		List <String> repeatedWords = new ArrayList<String> ();
		
		HashSet <String> uniqueSet = new HashSet<String> ();
		
		for(String str:strArr)
		{
			if(!uniqueSet.add(str))
			repeatedWords.add(str);
				
		}
		  System.out.println(repeatedWords);
		
		
	}
	
	public static void printNamaste()
	{
		if(System.out.printf("Namaste").equals(null))
		{
			
		}
	}
	
	public static void test(Object o)
	{
		 System.out.println("Object"); //object is super class of String
	}
	public static void test(String s)
	{
		 System.out.println("STring");
	}
/*	public static void test(StringBuilder sb)
	{
		 System.out.println("Builder");  // no link/heirarchy b/w builder/buffer and string , compiler will give error , 
	}  */
	
	public static void startPatterns()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				 System.out.print("*" +"\t");
				
			}System.out.println("");
		} 
	}
	
	public static void startPatternsInvert()
	{
		for(int i=0;i<=4;i++)
		{
			for(int j = 4;j>=i;j--)
			{
				 System.out.print("*" +"\t");
				
			}System.out.println("");
		} 
	}
	
	public static void PatternsNamesInverted()
	{
		String s = "shambhu";
		char[] arr = s.toCharArray();
		for(int i=0;i<=s.length();i++)
		{
			for(int j = s.length()-1;j>=i;j--)
			{
				 System.out.print( arr[j] +"\t");
				
			}System.out.println("");
		} 
	}
	
	public static void PatternsNames()
	{
		String s = "shambhu";
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j =0;j<=i;j++)
			{
				 System.out.print( arr[j] +"\t");
				
			}System.out.println("");
		} 
	}
	
	public static void main(String[] args) {
		
		palindrome(101);
		armStrongInRange(200);
		factorial(5);
		printDuplicateWords("Shambhu Shambhu Shambhu");
		printDuplicateWordsViaHashSet("Shambhu Shambhu Shambhu");
		printNamaste();
		test(null);  // pass null value , prefrence will be given to string method as its the commonly used one
		startPatterns();
		System.out.println("");
		startPatternsInvert();
		System.out.println("");
		PatternsNamesInverted();
		System.out.println("");
		PatternsNames();
		
		
	}

}
