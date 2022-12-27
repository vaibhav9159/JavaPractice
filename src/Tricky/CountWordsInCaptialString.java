package Tricky;

public class CountWordsInCaptialString {

	public static void main(String[] args) {

		String words = "BharatMataKiJai";
		int count = 0;
		for (int i = 0; i < words.length(); i++) {
			
			if (words.charAt(i) >= 'A' && words.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		
		
		
	}

}
