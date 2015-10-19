/*
 * Pig Latin is an English language game where the goal is to hide the meaning of the 
 * word from people not aware of the rules.
 */

package level2;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PigLatin.translate("aTranslate"));
	}

	public static String translate(String str){
		boolean isVowel = false;
		String[] vowels = {"a","e", "i", "o", "u"};
		for(String s: vowels){
			if(str.substring(0, 1).equals(s)){
				isVowel = true;
				return str.toLowerCase() + "way " ;
			}
		}
		if(!isVowel){
			str = str.substring(1, str.length()) + str.substring(0, 1) + "ay";
			return str.toLowerCase();
		}
		else return null;
		}
	   
}
