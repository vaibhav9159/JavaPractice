package Tricky;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoops {

	//recursivce func
	public static void print(int i)
	{
		if(i<=100)
		{
			System.out.println(i);
			i++;
			print(i); // need to call the same fucntion again, fucn calls itself
		}
	}
	
	public static void printNum(int start, int end) // without hardcoding
	{
		if(start<=end)
		{
			System.out.println(start);
			start++;
			printNum(start,end); // need to call the same fucntion again, fucn calls itself
		}
	}
	
	public static void main(String[] args) {

	//	print(1);
//		printNum(1,100);
		
		IntStream.range(1, 101).forEach(s->System.out.println(s));
		
	}

}
