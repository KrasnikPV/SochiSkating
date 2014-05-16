import java.util.*;

public final class NameGen {
	static String n() {
		char[] capChars = "ABCDEFGHIJKLMNOPQRSTUVWYXZ".toCharArray();
		StringBuilder name = new StringBuilder();
		Random random = new Random();
	    {
	    	char c = capChars[random.nextInt(capChars.length)];
	    	name.append(c);	    	
	    }
		
	    char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();		
		long nameLen = 2+(Math.round(Math.random()%5));
		for (int i = 0; i < nameLen; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    name.append(c);
		}
		
		name.append(' ');
		
	    {
	    	char c = capChars[random.nextInt(capChars.length)];
	    	name.append(c);
	    }
		
		long surnameLen = 3+(Math.round(Math.random()%6));
		for (int i = 0; i < surnameLen; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    name.append(c);
		}
		return name.toString();
	}

}
