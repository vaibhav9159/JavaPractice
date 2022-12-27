package JavaPrograms;

public class SwapNumbers {
  
	static int p ;
	static int q ;
	
	public static void main(String[] args) {
		SwapNumbers swap = new SwapNumbers();
		swap.p = 10;
		swap.q = 20;	
		swapValues(swap);
		swapSimple(100, 200);
	}

	
	public static void swapValues(SwapNumbers swapref)
	{
		int temp = swapref.p;
		swapref.p=swapref.q;
		swapref.q=temp;
		System.out.println(p + " =p q= "+ q);
	}
	public static void swapSimple(int a, int b)
	{
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a + " " + b);
	}
	
	
}
