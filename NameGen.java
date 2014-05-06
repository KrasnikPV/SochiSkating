import java.util.*;

public final class NameGen {
	static String n() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWYXZ".toCharArray();
		StringBuilder name = new StringBuilder();
		Random random = new Random();
	    {
	    	char c = chars[random.nextInt(chars.length)];
	    	name.append(c);	    	
	    }
		
		chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();		
		long nameLen = 2+(Math.round(Math.random()%5));
		for (int i = 0; i < nameLen; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    name.append(c);
		}
		
		name.append(' ');
		
		chars = "ABCDEFGHIJKLMNOPQRSTUVWYXZ".toCharArray();
	    {
	    	char c = chars[random.nextInt(chars.length)];
	    	name.append(c);
	    }
		
		chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();		
		long surnameLen = 3+(Math.round(Math.random()%6));
		for (int i = 0; i < surnameLen; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    name.append(c);
		}
		return name.toString();
	}

}
