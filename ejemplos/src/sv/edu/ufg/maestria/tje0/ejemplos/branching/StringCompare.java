package sv.edu.ufg.maestria.tje0.ejemplos.branching;

import sv.edu.ufg.maestria.tje0.ejemplos.util.*;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = Keyboard.getString("Enter String: ");
	    String s2 = Keyboard.getString("Enter String: ");
	    
	    if( s1.equalsIgnoreCase(s2) ) System.out.println("They be equal!");
	}

}
