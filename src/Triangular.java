/*Description:
Triangular numbers are so called because of the equilateral triangular shape that they occupy 
when laid out as dots. i.e.

1st (1)   2nd (3)    3rd (6)
*          **        ***
           *         **
                     *
You need to return the nth triangular number. You should return 0 for out of range values:*/

public class Triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Triangular.triangular(5));
	}
	
	
	public static int triangular(int n) {
	      int triang =0, incr = 0;
	      while(incr < n){
	        incr++;
	        triang += incr;
	      }
	      return triang;
	}
	
	/*BestPractice*/
	public static int triangular1(int n) {
        return (n <= 0) ? 0 : n * (n + 1) / 2;
    }
}
