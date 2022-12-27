package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestThree {

	public static void main(String[] args) {	
		
		
		int num = 12, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
		
		
	    
	    
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input

	    
	    
	    
	    
	    
	    
		Date d = new Date();
	//	System.out.println(d.toString());
		
		SimpleDateFormat s = new SimpleDateFormat("dd/M/yyyy HH:MM:SS");
		System.out.println(s.format(d));
		

	}

}
