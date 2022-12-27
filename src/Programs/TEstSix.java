package Programs;

import java.util.ArrayList;

public class TEstSix {

	public static void main(String[] args) {

		//print inverted pyramid
		
		int n =0;
		for(int i=0;i<5;i++)
		{
			for(int j =1;j<5-i;j++)
			{		n++;
				System.out.print(n);
				System.out.print("\t");
				
			}System.out.println("");
			
		}
		
		
		//print pyramid
		
		int k =0;
		for(int i=0;i<5;i++)
		{
			for(int j =1;j<=i;j++)
			{		k++;
				System.out.print(k);
				System.out.print("\t");
				
			}System.out.println("");
			
		}
		
		System.out.println("");
		
		// print reverse words
		
		String[] text = "Har Har Mahadev".split(" ");
		String rev = "";
		for(int i=text.length-1;i>=0;i--)
		{				
			rev = text[i] + " ";
			System.out.print (rev);
			
		}
		System.out.println("");
		
		// print reverse strings 
		
		String texttwo= "ShivShakti";
		for(int i=texttwo.length()-1; i>=0;i--)
		{
			System.out.print((texttwo.charAt(i)));
		}
		
		System.out.println("");
		
		////Print unique number	
	     int a[] = {4,4,5,5,6,6,6,7,7,7,9};
	     ArrayList <Integer> al = new ArrayList<Integer>();
	    
	     for(int i=0;i<a.length;i++)
	     {
	    	 int d = 0;
	    	 
	    	 if((!al.contains(a[i])))
	    	 {
	    		 al.add(a[i]);
	    		 k++;
	    		 
	    		 for(int j = i+1;j<a.length;j++)
	    		 {
	    			 if(a[i]==(a[j]))
	    			 {
	    				 d++;
	    			 }
	    		 }
	    		 System.out.println(a[i]);
	    		 System.out.println(d);
	    	 }
	     }
	     
		
		
	}

}
