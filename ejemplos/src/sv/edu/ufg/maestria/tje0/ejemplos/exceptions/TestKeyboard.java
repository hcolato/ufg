package sv.edu.ufg.maestria.tje0.ejemplos.exceptions;

import sv.edu.ufg.maestria.tje0.ejemplos.util.*;

public class TestKeyboard {

	public static void main(String[] args) {
		String s;
	    s = Keyboard.getString("Como se llama: ");
	    System.out.println("Hello " + s);
	    
	    int a;
	    try{
	      a = Keyboard.getInt("How old are you: ");
	      System.out.println(a + " is very old!");
	    }
	    catch(NumberFormatException ex){
	      System.out.println( ex.getMessage() );
	    }
	}

}
