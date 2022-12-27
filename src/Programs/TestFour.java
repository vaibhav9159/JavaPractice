package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFour {

	public static void main(String[] args) {
		
	//Print unique number	
     int a[] = {4,4,5,5,6,6,6,7,7,7,9};
     ArrayList <Integer> al = new ArrayList<Integer>();
    
     for(int i=0;i<a.length;i++)
     {
    	 int k = 0;
    	 
    	 if((!al.contains(a[i])))
    	 {
    		 al.add(a[i]);
    		 k++;
    		 
    		 for(int j = i+1;j<a.length;j++)
    		 {
    			 if(a[i]==(a[j]))
    			 {
    				 k++;
    			 }
    		 }
    		 System.out.println(a[i]);
    		 System.out.println(k);
    	 }
     }
     
     
     //SOrting an array
     
     int arr[] = { 4, 3, 2, 1 };
    Arrays.sort(arr);
     
    
    System.out.println(Arrays.toString(arr));
    
    
    
     // Outer loop
     for (int i = 0; i < arr.length; i++) {

         // Inner nested loop pointing 1 index ahead
         for (int j = i + 1; j < arr.length; j++) {

             // Checking elements
             int temp = 0;
             if (arr[j] < arr[i]) {

                 // Swapping
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }

         // Printing sorted array elements
         System.out.print(arr[i] + " ");
     }
     
     
     
	}

}
