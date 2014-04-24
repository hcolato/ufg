package sv.edu.ufg.maestria.tje0.ejemplos.branching;

import sv.edu.ufg.maestria.tje0.ejemplos.util.*;

public class If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = Keyboard.getInt("Enter your age: ");
	    if(i>80) {
	      System.out.println("You are one old dude");
	      System.out.println("I mean realy old, man!"); 
	    }
	    else if(i>65){
	      System.out.println
	      ("You could retire and collect soc security in US");
	    }
	    else if(i>21){
	      System.out.println("You are old enough to drink boose in US");    
	    }
	    else{
	      System.out.println("You are but a youngster");
	    }
	    System.out.println("Done");
	}

}
