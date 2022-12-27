package ExceptionHandling;

// is also used to handle exceptions when we have method chaining
//Object -> superclass of throwable
//throwable - super class of errors and exceptions classes

public class ThrowsKeyword {


public void sum() throws ArithmeticException  // sum method will catch this exception and will give to main method
{	
	div();	
}

public void div() throws ArithmeticException  // throws keyword added to handle exception
{
try{
	int i = 1/0;
} 

catch(Throwable e)
{
	System.out.println("try catch test");
}
}


public static void main(String[] args) throws ArithmeticException {// main method catched the exception - but this also throws exception 
																		//	so JVM will handle it
		
		ThrowsKeyword k = new ThrowsKeyword();
		
		k.sum();
	}

}
