package Tricky;

import java.lang.reflect.Field;

public class LanguageTranslator {

	static
	{
		try {
			Field value= String.class.getDeclaredField("value");
			value.setAccessible(true);
		try {
			value.set("Namaste Shiva", value.get("Har Har Mahadev"));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//value.setAccessible(true);
		
	}
	
	public static void main(String[] args) {
	
		
		System.out.println("Namaste Shiva");

	}

}
