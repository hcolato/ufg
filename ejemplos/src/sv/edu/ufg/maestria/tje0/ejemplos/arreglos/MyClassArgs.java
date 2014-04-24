package sv.edu.ufg.maestria.tje0.ejemplos.arreglos;

public class MyClassArgs {

	/**
	 * @param args
	 */
		  public static void main(String[] args){
		    if(args.length == 0) {
		      System.out.println("Duh, the whole point of this excersize is to use command line arguments");
		      return;
		    }

		    for(int i=0;i<args.length;i++){
		      System.out.println("arg# " + i + ": " + args[i]);
		    }
		  }
		}
