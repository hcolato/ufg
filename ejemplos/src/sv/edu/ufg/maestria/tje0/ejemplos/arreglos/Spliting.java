package sv.edu.ufg.maestria.tje0.ejemplos.arreglos;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Spliting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lista1;
		try {
			lista1 = args[0].split(":");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Favor ingrese almenos un argumento con formato -> valor1:valor2\n");
			return;
		}
		
		List<String> lista2 = new ArrayList<String>();
		
		System.out.println("lista1 length: " + lista1.length);
		int i =0;
		while (i<lista1.length) {
			lista2.add(lista1[i++]);
		}
		
		Iterator<String> iter = lista2.iterator();
		i=0;
		while (iter.hasNext()) {
			
			System.out.println("Elemento: " + i++ + iter.next().toString()+"\n");
		}
		
		

	}

}
