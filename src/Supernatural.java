/*
 * You can access the database as drunkenDoodling or drunken_doodling depending on your language.

So a call would go down like this:

The guys call you: bob('rugaru')

...and you reply (return) with the info, and your signature saying of yours! Burn it alive, idjits!*/

import java.util.*;

public class Supernatural {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Supernatural.bob("rugaru"));
	}
	 public static String bob(String beast) {
		    Map<String, String> drunkenDoodling = new HashMap<String, String>();
		    drunkenDoodling.put("vampire", "Behead it with a machete");
		    drunkenDoodling.put("pagan god", "It depends on which one it is");
		    drunkenDoodling.put("wendigo", "Burn it to death");
		    drunkenDoodling.put("werewolf", "Silver knife or bullet to the heart");
		    drunkenDoodling.put("shapeshifter", "Silver knife or bullet to the heart");
		    drunkenDoodling.put("shapeshifter", "Silver knife or bullet to the heart");
		    drunkenDoodling.put("angel" , "Use the angelic blade");
		    drunkenDoodling.put("demon" , "Use Ruby's knife, or some Jesus-juice");
		    drunkenDoodling.put("ghost" , "Salt and iron, and don't forget to burn the corpse");
		    drunkenDoodling.put("dragon" , "You have to find the excalibur for that");
		    drunkenDoodling.put("djinn" , "Stab it with silver knife dipped in a lamb's blood");
		    drunkenDoodling.put("leviathan" , "Use some Borax, then kill Dick");
		    drunkenDoodling.put("ghoul" , "Behead it");
		    drunkenDoodling.put("jefferson starship" , "Behead it with a silver blade");
		    drunkenDoodling.put("reaper" , "If it's nasty, you should gank who controls it");
		    drunkenDoodling.put("rugaru" , "Burn it alive");
		    drunkenDoodling.put("skinwalker" , "A silver bullet will do it");
		    drunkenDoodling.put("phoenix" , "Use the colt");
		    drunkenDoodling.put("witch" , "They are humans");
		    
		    if(drunkenDoodling.containsKey(beast)){
		        String strategy = (String)drunkenDoodling.get(beast);
		        return (strategy + ", idjits!"); 
		  
		    }else
		        return "I have friggin no idea yet, idjits!";    
		    
		  }
		}

