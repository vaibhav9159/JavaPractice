package Tricky;

import java.util.StringJoiner;

public class combineMultipleStringsInOne {

	public static void main(String[] args) {
		
		
		StringJoiner j = new StringJoiner(",", "{", "}");
		
		j.add("shiva").add("shakti").add("SHambhu").add("jagdamba");
		
		System.out.println(j.toString());
		
		
	}
}
