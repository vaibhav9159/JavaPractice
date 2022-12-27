package DataTypes;

public class DataTypes {

	public static void main(String[] args) {
	
		
		//primitive data types = int, doublce, char, boolean
		int i = 1;
		i=2;
		
		double d = 1.1;
		d = 100;  //treated as 100.00
		
		char c = 's'; //single digit val within quotes
		c ='$';
		
		boolean b1 = true;
		b1 = false;
		
		String s = "namaste";
		String s1 = "131.99";
		
		int a= 11;
		int b = 21 ;
		int e = 31;
		
		if(a> b & a>e)
		{
			
		}
		
		//incremental decremental
		int in = 2;
		int in1 = in++;
		System.out.println(in1);
		int in2 = in--;
		System.out.println(in2);
		
		int in3 =--in;
		System.out.println(in3);
		int in4 =++in;
		System.out.println(in4);
		
	//	System.out.println(in1 + ""+ in2 +""+in3 +""+in4);
		
		double [] arr = new double[3];
		arr[0] = 1.1345;
		
		//object array is used to overcome static array , fixed size issue 
		
		Object obj[] = new Object[3];
		obj[0]= 1.1;
		obj[1] = "shiva";
		obj[2] = 'c';
		System.out.println(obj[1]);
		System.out.println(obj.length);
		
	}

}
