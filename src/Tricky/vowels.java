package Tricky;

import com.google.common.base.CharMatcher;

public class vowels {

	//1 
	public static boolean isVowel(char t)
	{
		return t == 'a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}
	
	public static void main(String[] args) {
	
		String s = "JaiHind";
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(isVowel(s.charAt(i))){
			count++;
		}
		}
		System.out.println(count);
	
		// 2 using guava lib
		int guavaCount = CharMatcher.anyOf("aeiou").countIn(s);
		System.out.println(guavaCount);
	
	}
}
