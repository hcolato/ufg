package sv.edu.ufg.maestria.tje0.ejemplos.arreglos;

import java.util.ArrayList;

/**
 * 
 * @author PC17
 * Clase ejemplo...
 */

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
	    list.add("Fred");
	    list.add("Wilma");
	    list.add("Betty");
	    list.add("Barney");
	    list.add("Pebbles");
	    
	    //while arrays have a "length" instance variable
	    //ArrayList has a "size()" method
	    //they do the same.
	    for(int i = 0;i< list.size();i++){
	      System.out.println( list.get(i) );
	    }

	}

}
