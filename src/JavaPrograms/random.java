package JavaPrograms;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.math.Stats;
import com.google.common.primitives.Ints;

public class random {

	static String s = "11";
	static String s1 = "shiva";
	static String rajya[] = {"uttar pradesh","madhya pradesh", "himanchal pradesh"};
	static String shehar[] = {"varanasi","ujjain","dharmshala"};
	
	
	public static int StringToInt()
	{
		int sum=0;
		int zeroAsc = (int)'0';
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int Asc = (int)ch[i];
			sum = sum*10 + (Asc-zeroAsc);
		}System.out.println(sum+10);
		return sum;
	}
	
	public static void printPattern()
	{
		for(int i=0;i<s1.length();i++)
		{
			for(int j=s1.length()-1;j>=i;j--)
			{
				System.out.print(s1.charAt(j) + "\t");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		StringToInt();
		
		printPattern();
		
		
		String guava[] = ObjectArrays.concat(rajya, shehar, String.class);
		
		Stream a=	Arrays.stream(rajya);
		Stream b = Arrays.stream(shehar);
		String[] c = (String[]) Stream.concat(a, b).toArray(size->new String[size]);
		
		for(String s:guava)
		{
			System.out.println(s);
		}

	}

}
