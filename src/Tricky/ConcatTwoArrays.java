package Tricky;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.math.Stats;
import com.google.common.primitives.Ints;

public class ConcatTwoArrays {

	public static void main(String[] args) {

	
		String [] batsmen = {"Sachin Tendulkar","Virender Sehwag","MS Dhoni","Yuvraj Singh","Virat Kohli","Suresh Raina"};
		String [] bowler = {"Nehra ji","bhuvenshvar kumar", "Jaddu", "Ashwin","chahal","bumrah"};
		
		// streams
		
		Stream <String> bats = Arrays.stream(batsmen);
		Stream<String> bowls = Arrays.stream(bowler);
		
		String[] fullteam=Stream.concat(bats, bowls).toArray(size->new String[size]);
		
		for(String s:fullteam)
		{
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~~~~~");
		String guavaArray[] = ObjectArrays.concat(batsmen, bowler, String.class);
		for(String s:guavaArray)
		{
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~~~~~");
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = Ints.concat(a,b);
		for(int s:c)
		{
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~~~~~");
		
		
		//average of an array
		int count = 0;
		for(int s:c)
		{
			count = count + s;
			
		}
		System.out.println("average of an array = "+ count/c.length);
	
		// via guava 
	double guavaAvg = Stats.meanOf(c);
	System.out.println(guavaAvg);
	
	//streams 
	OptionalDouble streamAvg = Arrays.stream(c).average();
	System.out.println(streamAvg.getAsDouble());
		
	
	
	
	
	}

}
