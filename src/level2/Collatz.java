/*
 * The Collatz Conjecture states that for any natural number n, if n is even, divide it by 2. If n is odd, 
 * multiply it by 3 and add 1. If you repeat the process continously for n, n will eventually reach 1.
For example, if n = 20, the resulting sequence will be:
[20, 10, 5, 16, 8, 4, 2, 1]
Write a program that will output the length of the Collatz Conjecture for any given n. In the example above,
the output would be 8.
*/

package level2;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Collatz.conjecture(7));
	}
	
	public static long conjecture(long x) {
		long length = 1;
		System.out.print(x+" ");
	    while(x !=1){
	    	x = (x % 2 == 0 ? x/2: x*3+1);
			length++;
			System.out.print(x+" ");
	    }		
	    System.out.println();
		return length;
	  }
}
