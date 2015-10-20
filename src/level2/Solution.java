/*
 * The goal of this kata is to code a function wich will be given two input, m and n, 
 * and will return the Ackermann number A(m,n) defined by:
A(m,n) = n+1                          if m=0  
A(m,n) = A(m-1,1)                     if m>0 , n=0
A(m,n) = A(m-1,A(m,n-1))              if m,n > 0
*/
package level2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.Ackermann(-9, 3));
	}

	public static int Ackermann(int m, int n){
	    if(m==0)
	    	return n+1;
	    else if (m>0 && n==0)
	    	return Ackermann(m-1, 1);
	    else if(m>0 && n>0)
	    	return Ackermann(m-1,Ackermann(m,n-1));
	    else return 0;
	  }
}
