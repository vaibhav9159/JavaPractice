package ExceptionHandling;

//try catch helps to prevent termination of prog 
public class ThrowKeyword {

	public static void main(String[] args) {

		try
		{
			throw new Exception("test throw");
			
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
System.out.println("print last");
	}

}
