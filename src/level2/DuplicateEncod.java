/*
 * The goal of this exercise is to convert a string to a new string where each character 
 * in the new string is '(' if that character appears only once in the original string, 
 * or ')' if that character appears more than once in the original string. Ignore 
 * capitalization when determining if a character is a duplicate.
 * */

package level2;

public class DuplicateEncod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DuplicateEncod.encode("recede"));
	}
	
	static String encode(String word){
		word = word.toLowerCase();
		String result = "";
		for(int i=0; i<word.length(); i++){
	    	int duplicate = 0;
	    	for(int j=0; j<word.length() ; j++){
	    		if(word.charAt(i)==word.charAt(j) && j != i)
	    			duplicate++;	    		
	    	}
	    	if(duplicate > 0)
	    		result +=")";
	    	else
	    		result +="(";
	    }
		return result;
	  }
	
	/*Best Practce*/
	
	static String encode1(String word){
	    word = word.toLowerCase();
	    String result = "";
	    for (int i = 0; i < word.length(); ++i) {
	      char c = word.charAt(i);
	      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
	    }
	    return result;
	  }

	static String encode2(String word){
	    String lowerWord = word.toLowerCase();
	    StringBuilder result = new StringBuilder();
	    for(char ch: lowerWord.toCharArray()) {
	      boolean single = lowerWord.indexOf(ch) == lowerWord.lastIndexOf(ch);
	      result.append(single ? '(' : ')');
	    }
	    return result.toString();
	  }
}
