package Programs;

import java.util.ArrayList;

public class TestOne {

	public static void main(String[] args) {
		
				
		//pyramids
    int n = 1;
		
		for(int l=0;l<4;l++)
		{
			for(int m=1; m<=4-l;m++)
			{
				System.out.print(n);
				System.out.print("\t");
				 n++;
				
			}
			System.out.println("");	
		}	
	
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		
		for(int p=0;p<5;p++)
		{
			for(int q=1; q<=p;q++)
			{
				
				System.out.print(n);	
				System.out.print("\t");
				 n++;
				
			}
			System.out.println("");	
		}	
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		
		int f = 1;
		for(int p=0;p<5;p++)
		{
			for(int q=1; q<=p;q++)
			{
				
				System.out.print(f*3);	
				System.out.print("\t");
				 f++;
				
			}
			System.out.println("");	
		}	
		
		
		
		
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		
		
		
		
		ArrayList a1 = new ArrayList();
		a1.add("shiva");
		a1.add("shakti");
		a1.add("krishna");
		a1.remove(2);
		
		
		String s1 = "Har Har Mahadev";
		
//reverse words
		
String[] s2 = "Har Har Mahadev".split(" ");
		
		String rev = "";
		
		for(int k =s2.length-1;k>=0;k--)
		{
		rev  = s2[k] + " ";
		System.out.println(rev);
		}
	
		
		
	// chars	
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
	
		
		// reverse chars
		for(int j=s1.length()-1;j>=0;j--)
		{
			System.out.println(s1.charAt(j));	
		}

		
		
		
		
		double a = 1.01;
		
		String arr1[] = {"aam", "kela", "seb" , "santra"};
        System.out.println(arr1[0]);
        
        for(int i=0;i<arr1.length;i++)
        {
        	 String text = arr1[i];
     		System.out.println(text);
        }
        
        for(String s:arr1)
        {
        	System.out.println("enhanced for loop "+s);
        }
        
        
        int arr2[] = {1,2,3,4,5,6,7,8,9,10,122};
        for(int i=0;i<arr2.length;i++)
        {
        	if(arr2[i]%2==0&&arr2[i]<10)
        	{
        		System.out.println(" for loop "+ arr2[i]);
        		
        	}
        	
        	else
        	{
        		System.out.println(" for loop else block "+ arr2[i]);
        		
        	}
        	
        	}
      
        
        }


	}
