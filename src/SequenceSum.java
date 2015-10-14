import java.util.stream.IntStream;

public class SequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = sumOfN(-5);
		for(int i=0; i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

	
	public static int[] sumOfN(int n) {
		
	    int[] result = new int[Math.abs(n)+1]; 
	    System.out.println("Array length: "+result.length);
	    result[0] = 0;
	    for(int i=1; i<result.length; i++){
	    		result[i] = i+ result[i-1];
	    }
	    for(int i=1; i<result.length; i++){
	    	if(n<0)
	    		result[i] = -result[i];
	    }
	    return result;
	  }
	
	/*BestPractice*/
	public static int[] sumOfN1(int n) {
	    int[] result = new int[Math.abs(n) + 1];
	    
	    int sum = 0;
	    int sign = (int) Math.signum(n);
	    
	    for (int i = 0; i < result.length; i++) {
	      result[i] = sum + sign * i;
	      sum += sign * i;
	    }
	    
	    return result;
	  }
	
	/*BestPractice*/
	public static int[] sumOfN2(int n) {
        int[] result = new int[Math.abs(n)+1];
        for(int i = 1; i < result.length; i++)
            result[i] = result[i-1] + (n > 0 ? i : -i);
        return result;
  }
	/*BestPractice*/
	public static int[] sumOfN3(int n) {
	    int modifier = n < 0 ? -1 : 1;
	    int[] range = new int[Math.abs(n) + 1];
	    IntStream.rangeClosed(0, Math.abs(n)).forEach(
	      i -> {range[i] = i == 0 ? 0 : range[i - 1] + i * modifier;}
	    );
	    return range;
	  }
}
