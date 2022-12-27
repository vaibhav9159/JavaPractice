package Programs;

import java.util.Scanner;

public class EncryptDecrypt {

	public static void main(String[] args) {

		//encrypt
		char grade = 'A';
		grade = (char)(grade +11);
		System.out.println(grade);
		
		//decrpyt
		grade = (char)(grade-11);
		System.out.println(grade);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int i = sc.nextInt();
		System.out.println(i>10);
		

	}

}
