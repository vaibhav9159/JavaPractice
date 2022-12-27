package JavaPrograms;

import java.util.stream.IntStream;

public class DuplicateWordsInString {

	public static void getDuplicateWordsAndCount(String inputText)
	{
	// String string = "Shambhu shambhu shambhu shambhu shiva shankar adi anant mahadev";  
     int count;  
       
     //Converts the string into lowercase  
     inputText = inputText.toLowerCase();  
       
     //Split the string into words using built-in function  
     String words[] = inputText.split(" ");  
       
     System.out.println("Duplicate words in a given string : ");   
     for(int i = 0; i < words.length; i++) {  
         count = 1;  
         for(int j = i+1; j < words.length; j++) {  
             if(words[i].equals(words[j])) {  
                 count++;  
                 //Set words[j] to 0 to avoid printing visited word  
                 words[j] = "0";  
             }  
         }  
           
         //Displays the duplicate word if count is greater than 1  
         if(count > 1 && words[i] != "0")  
             System.out.println(words[i] + " : " + count);  
     }
	
}
	public static void main(String[] args) {
	
		getDuplicateWordsAndCount("Shambhu Shambhu Shambhu Shambhu har har mahadev aum namah shivay");
		
	}

}
