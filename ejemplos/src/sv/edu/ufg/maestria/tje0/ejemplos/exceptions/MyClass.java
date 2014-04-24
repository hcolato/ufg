package sv.edu.ufg.maestria.tje0.ejemplos.exceptions;

//this class will take a number from the user
//and cube it.

public class MyClass {


	public static void main(String[] args) {
		String s;
	    int i;
	    long c;

	    try{
	      s = args[0];  //read in a command line argument
	      i = Integer.parseInt(s); //convert string to int 
	    }
	    catch(Exception ex){
	      //System.out.println( ex.getMessage() );
	      //System.out.println( ex.toString() ); 
	      ex.printStackTrace();     
	      return; //exit the method
	    }
	    
	    c = i * i * i;
	    
	    System.out.println(i + " cubed is " + c); 

	}

}
