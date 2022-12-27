package JavaPrograms;

//1*1*1 , 5*5*5 , 3*3*3 = 1+125+27 = 153
public class Armstrong {

	public static void getArmstrongNumber(int num)
	{
		int r;
		int cube = 0;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
			
		}
		if(t==cube)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
		
	
	public static void main(String[] args) {
		
		getArmstrongNumber(153);

	}

}
