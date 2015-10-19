/*
 * Write a method, isCircleSorted(int[] A) that determines if A is circularly sorted. An Array is circularly sorted if the 
 *  elements are sorted in ascending order, but displaced, or rotated, by any number of 
 *  steps.
For Example:
// True:
isCircleSorted([2,3,4,5,0,1]);
isCircleSorted([4,5,6,9,1]);
isCircleSorted([10,11,6,7,9]);
*/

package level2;

public class CircleSorted {

	public static void main(String[] args) {
		int[] a = {9,10,14,12};
		System.out.println(isCircleSorted(a));
	}

	 public static boolean isCircleSorted(int[] a) {
		 int fluctuations = 0; //Number of times the next number is smaller must be one
		 for(int i =0; i< a.length-1; i++){
			 if (a[i] > a[i+1])
				 fluctuations++;	
		 }
		if ((fluctuations == 0)||(fluctuations == 1 && a[0] > a[a.length-1])) //1st number must be smaller than last 
			return true;
		else return false;
   }
	 
	 //Best Practice
	 
	 public boolean isCircleSorted1(int[] a) {
	        int disorder = 0;
	        for (int i = 0; i < a.length; ++i)
	            if (a[(i==0 ? a.length : i)-1] > a[i])
	                ++disorder;
	        return disorder <= 1;
	    }
	
}
