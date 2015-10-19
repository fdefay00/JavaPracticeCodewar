/*Description:
A triangle number is a number where n objects form an equilateral triangle (it's a bit hard to explain). For example, 6 is a triangle number because you can arrange 6 objects into an equilateral 
triangle:
  1
 2 3
4 5 6

8 is not a triangle number because 8 objects do not form an equilateral triangle:
   1
  2 3
 4 5 6
7 8
Check if a given input is a valid triangle number. Return true if it is, false if it is not (note that any 
non-integers, including non-number types, are not triangle numbers).
*/

package level2;

public class TriangleNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TriangleNumbers.isTriangleNumber(8));
	}

	private static boolean isTriangleNumber(long number) {
		int incr = 1;
		while(number > 0){
			number -= incr;//take out the next number until i == 0 or < 0
			incr++;
		}
		return number ==0 ? true: false; 
	}
	
	/*BestPractice*/
	
	public static Boolean isTriangleNumber1(long number) {
	    return Math.sqrt(1+8*number)%1==0;
	  }
}
