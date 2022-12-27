package Tricky;

public class IntegerCaching {

	public static void main(String[] args) {
	
		//Range -> -128 to 127 - beyond this it will give false 
		
		//within range 
			Integer num1 = -128;
			Integer num2 = -128;
			
			if(num1==num2)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			
			// beyond range -  will give false 
			
			Integer num3 = 128;
			Integer num4 = 128;
			
			if(num3==num4)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			
	}

}
