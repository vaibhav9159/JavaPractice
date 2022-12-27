package Programs;

import java.util.Scanner;

public class PercentageCalculator {
     static float maxMarks = 300;
     static double mile = 1.6;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject name 1");
		sc.next();
		System.out.println("Enter Marks");
		int sub1 = sc.nextInt();
		System.out.println("Enter Subject name 2");
		sc.next();
		System.out.println("Enter Marks");
		int sub2 = sc.nextInt();
		System.out.println("Enter Subject name 3");
		sc.next();
		System.out.println("Enter Marks");
		int sub3 = sc.nextInt();
		
		float totalMarks = sub1+sub2+sub3;
		System.out.println("Total sum of marks = " + totalMarks + " out of 300" );
		
		float percentage = (totalMarks/maxMarks)*100;
		System.out.println("Total percentage = " + percentage);

		
		//miles to km 
		System.out.println("enter km value");
		double km = sc.nextDouble();
		double kms = km*mile;
		System.out.println("convert mile to km value = "+kms);
	
	
		
		
		
		
		
		
		

	}

}
