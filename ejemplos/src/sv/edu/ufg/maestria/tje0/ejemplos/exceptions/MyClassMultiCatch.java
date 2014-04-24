package sv.edu.ufg.maestria.tje0.ejemplos.exceptions;

public class MyClassMultiCatch {

	public static void main(String[] args) {
		String s;
	    int i;
	    long c;

	    try{
	      s = args[0];  //read in a command line argument
	      i = Integer.parseInt(s); //convert string to int 
	    }
	    catch(ArrayIndexOutOfBoundsException ex){
	      System.out.println("you forgot to include an argument, duh");
	      return;
	    }
	    catch(NumberFormatException ex){
	      System.out.println(ex.getMessage() + " is not an int");
	      return;
	    }
	    catch(Exception ex){
	      //this catches anyother exception I forgot to handle above
	      ex.printStackTrace();
	      return;
	    }
	    
	    c = i * i * i;
	    
	    System.out.println(i + " cubed is " + c); 
	}

}
