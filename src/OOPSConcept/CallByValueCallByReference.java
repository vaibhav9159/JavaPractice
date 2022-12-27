package OOPSConcept;

public class CallByValueCallByReference {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValueCallByReference c = new CallByValueCallByReference();
		int x = 30;
		int y = 40;
		System.out.println(c.test(x, y));
		
		c.p=50;
		c.q=60;
		
		//swapping p and q
		c.swap(c);
		System.out.println(c.p);
		System.out.println(c.q);
	}
	
	//call by value - passing parameters to a function 
	public int test(int a, int b) {
	//	a = 10;
	//	b = 20;
		int c = a + b;
		return c;
	}

	//call by reference - swapping numbers - t - ref variable of class , t = c
	public void swap(CallByValueCallByReference t)
	{
		int temp;
		temp = t.p; // temp = 50
		t.p=t.q  ;  // p=60, q = 50, swapping done
		t.q=temp;
	}
	
}
