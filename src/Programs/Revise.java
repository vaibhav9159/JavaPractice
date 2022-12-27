package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revise {
	
	static String name = "ShivaShakti";
	static int vowelCOunt ;
	static int consoCount;
	static boolean isPrime;
	static int num;
	static String sentence = " Shiva aur Shakti";
	

	public static void vowel1()
	{
		for(int i=0;i<name.length();i++)
		{
			if(isVowel(name.charAt(i)))
			{
				vowelCOunt++;
			}
			else 
			{
				consoCount++;
			}
		}
		System.out.println("vowels count = " + vowelCOunt);
		
	}
	
	private static boolean isVowel(char ch) {
		
		Character.toLowerCase(ch);
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	}

	public static boolean vowelS(String vowels)
	{
		return vowels.toLowerCase().matches(".*[aeiou].*");
		
	}
	
	public static void primeTest()
	{
		num = 11;
		isPrime= true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
				
		}
		
		if(isPrime)
		{
			System.out.println(num + " is prime number");
		}
		else 
		{
			System.out.println("not a prime number");
		}
		
	}
	
	public static void uniqueNum()
	{
	 int a[] = {4,4,5,5,6,6,6,7,7,7,9};
     ArrayList <Integer> al = new ArrayList<Integer>();
     List<int[]> ls = Arrays.asList(a);
     ls.stream().sorted().distinct().forEach(s->System.out.println(s));
     
	}
	
	public static void reverseStrings()
	{
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print( name.charAt(i)+ "\t" );
			
		}
	}
	
	public static void reverseWords()
	{
		String rev = "";
		String[] text = sentence.split(" ");
		
		for(int i=text.length-1;i>=0;i--)
		{
			rev = rev+ text[i] + " ";
			
		}System.out.println(rev);
	}
	

	public static void main(String[] args) {

		
		
		vowel1();
		System.out.println("vowels match = " + vowelS(name));
		primeTest();
		uniqueNum();
		reverseStrings();
		reverseWords();
	}

	

}
