package JavaPrograms;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "chrome";
		
		switch(browser)
		{
		case "chrome" :
		
			System.out.println("browser is chrome");
		break;
		case "firefox" :
			
			System.out.println("browser is firefox");
		break;
		
		default:
			System.out.println("browser is not selected");
		
		}

	}

}
