package sv.edu.ufg.maestria.tje0.ejemplos.branching;

import sv.edu.ufg.maestria.tje0.ejemplos.util.*;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int m = Keyboard.getInt("Enter month number (1-12): ");
	    switch(m){
	    case 1: 
	      System.out.println("Jan");
	      break;
	    case 2:
	      System.out.println("Feb");    
	      break;
	    case 3:
	      System.out.println("Mar");    
	      break;
	    case 4:
	      System.out.println("Apr");    
	      break;
	    case 5:
	    case 6:
	    case 7:
	    	System.out.println(" May, Jun or Jul");
	    break;  
	    default:
	      //this will execute for anything else
	      System.out.println(m + " is not a valid month number"); 
	    }
	}

}
