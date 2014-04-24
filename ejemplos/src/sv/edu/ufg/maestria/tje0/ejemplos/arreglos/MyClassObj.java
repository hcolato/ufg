package sv.edu.ufg.maestria.tje0.ejemplos.arreglos;

public class MyClassObj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Room[] a;   //a is a reference (allocates 1 pointer)
	    a = new Room[2];  //allocates 2 pointers (ref)

	    //instantiate the Rooms
	    for(int i = 0;i< a.length;i++){
	      a[i] = new Room();
	    }

	    //populate the room with data
	    a[0].name   = "Computer Room";
	    a[0].length = 10;
	    a[0].width  = 5;
	    a[0].costSY = 4;
	    
	    a[1].name   = "Garage";
	    a[1].length = 4;
	    a[1].width  = 4;
	    a[1].costSY = 12;

	    for(int i = 0;i< a.length;i++){
	      a[i].calc();
	      a[i].print();
	    }                                               
	  }
}
