package sv.edu.ufg.maestria.tje0.ejemplos.encapsulation;

import sv.edu.ufg.maestria.tje0.ejemplos.util.*;

public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Room r1; //declare variable of type Room (allocates 1 pointer)
		    r1 = new Room();//create an intance of Room  (allocates inst vars)

		    try{
		      r1.setLength(  Keyboard.getInt("Length: ")  );
		      r1.setWidth(   Keyboard.getInt("Width: ")  );
		      r1.setCostSY(  Keyboard.getInt("CostSY: ")  );
		    }
		    catch(IllegalArgumentException ex){
		      System.out.println( ex.getMessage() );
		      return;
		    }
		    r1.print();
		  }
	}

