package Programs;

import java.util.Arrays;
import java.util.List;

public class TestSeven {
	
	
	
	//Check if two arrays contains same elements
	
	

	
	//print prime numbers - 
	
	public static boolean prime(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	

	//print only vowels

	public static boolean vowel(String vowels)
	{
		
		return vowels.toLowerCase().matches(".*[aeiou].*");
	}
	
	
	
	// if a List of integers contains only odd numbers
	
	static int[] list  = {1,3,5,7};
	public static boolean odd () {
	for(int i: list)
	{
		if(i%2==0)
		{
			return false;
		}
	}
	return true;
	}
	
	 //palindrome - 
	static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		for(int i=0; i < length/2; i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println(vowel("Namaste"));
		System.out.println(prime(79));
		System.out.println(odd());
		System.out.println(checkPalindromeString("OYO"));
		

		String  s0 = " Namaste ";
		s0 = s0.trim();
		System.out.println(s0);
		
		int k=0 ;
		for(int c = 0;c<s0.length();c++)
		{
			if(s0.charAt(c)!=' ')
				{
			k++;
			}
		}System.out.println(k);
		
		List ls = Arrays.asList(1,3,2,6,4,0,9,7,5);
		ls.stream().sorted().forEach(s-> System.out.println(s));
		
		int a[] = {1,2,3,4,5,6,0,11};
		 Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 
		 String s1 = "abc";
		 String s2 = "abc";
		 System.out.println("s1 == s2 is:" + s1 == s2);
				
	}

}
