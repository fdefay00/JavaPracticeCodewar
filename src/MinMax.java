import java.util.Arrays;

/*
 * Description:

Write a function that returns both the minimum and maximum number of the given list/array.
Examples
MinMax.minMax(new int[]{1,2,3,4,5}) == {1,5}
MinMax.minMax(new int[]{2334454,5}) == {5, 2334454}
MinMax.minMax(new int[]{1}) == {1, 1}
Remarks
All arrays or lists will always have at least one element, so you don't need to check the length. 
Also, your function will always get an array or a list, you don't have to check for null, undefined or similar.
*/
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax.minMax(new int[]{1,2,3,4,5});
	}
	
	public static int[] minMax(int[] arr) {
        // Your awesome code here
         Arrays.sort(arr);
         System.out.println("Min:"+ arr[0]+ " Max: "+arr[arr.length-1]);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
