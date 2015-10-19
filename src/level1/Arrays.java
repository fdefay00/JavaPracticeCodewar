package level1;
/*
 * Description:
Write a function that can return the smallest value of an array or the index of that value. 
The function's 2nd parameter will tell whether it should return the value or the index.
Assume the first parameter will always be an array filled with at least 1 number and no duplicates. 
Assume the second parameter will be a string holding one of two values: 'value' and 'index'.
 */
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  {4,5,7,8,56,88,11,6,45,1,34};
		System.out.println(Arrays.findSmallest(array, "index"));
	}
	
	public static int findSmallest( final int[] numbers, final String toReturn ) {
	    //TODO: Add solution here
	    int min = numbers[0];
	    int index = 0;
	    int j = 0;
	    for (int i: numbers){
	      if(i < min){
	        min = i;
	        index = j;
	      }
	      j++;
	    }
	    return (toReturn=="value" ? min: index);
 }   
	
	/*BestPractice*/
	public static int findSmallest1( final int[] numbers, final String toReturn ) {
	    int lowest = 0;
	    for (int i = 1; i < numbers.length; ++i) 
	      if (numbers[i] < numbers[lowest]) lowest = i;
	    return (toReturn == "index") ? lowest : numbers[lowest];
	    }
}
