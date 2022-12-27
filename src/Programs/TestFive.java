package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFive {

	public static void main(String[] args) {

		
		//Print unique number	
	     int a[] = {4,4,5,5,6,6,6,7,7,7,9};
	     
	     ArrayList<Integer> al = new ArrayList<Integer>();
	     for(int i=0;i<a.length;i++)
	     {
	    	 int k = 0;
	    	 if(!al.contains(a[i]))
	    	 {
	    		 al.add(a[i]);
	    		 k++;
	    	 
	    	 for(int j=i+1;j<a.length;j++)
	    	 {
	    		 if(a[i]==a[j])
	    		 {
	    			 k++;
	    		 }
	    	 }
	    	 System.out.println(a[i]);
    		 System.out.println(k);
	     }  
	    	 if(k==1)
	    	 {
	    		 System.out.println("unique num is = "+ a[i]);
	    	 }
	  }   
	    
	     //SORT array 
	     
	     int arr[] = { 4, 3, 2, 1 };
	     Arrays.sort(arr);
	   
	     
	     System.out.println(Arrays.toString(arr).replace("[", "").replace("]", ""));
	     
	     
	     for(int c=0; c<arr.length;c++)
	    	 
	     { 
	    	 for(int d=c+1;d<arr.length;d++)
	    	 {
	    		 int temp = 0;
	    		 if(arr[d]<arr[c])
	    		 {
	    			 temp= arr[c];
	    			 arr[c]=arr[d];
	    			 arr[d]=temp;
	    			
	    		 }
	    		
	    	 }
	    	 System.out.print(arr[c] + " ");
	     }
	     
	     System.out.println();
	     
	     
	     
	     
	     
	     String text = "Har har mahadev";
	     
	     for(int p=text.length()-1;p>=0;p--)
	     {
	    	 System.out.print(text.charAt(p) + " ");
	    	 
	     }
	     
	     
	     System.out.println();
	     
	     String textRev[] = "Har har mahadev".split(" ");
	     String rev = "";
	     for(int q=textRev.length-1;q>=0;q--)
	     {
	    	 rev = textRev[q] + " ";
	    	 System.out.print(rev);
	    	 
	     }
	     
	     
	     System.out.println();
	     
	     int n=0;
	     for(int l=0;l<5;l++)
	     { 
	    	 for(int m =1;m<5-l;m++)
	    	 {n++;
	    		 System.out.print(n);
	    		 System.out.print("\t");
	    		 
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println();
	     
	     
	     
	     
	     
	}

}
