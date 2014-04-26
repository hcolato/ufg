package sv.edu.ufg.maestria.tje0.ejemplos.inheritence;

public class FigurasGeometricas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RegularShapes[] figs; // figs es una variable no objeto
		figs = new RegularShapes[3];
		
		figs[0] = new Circle((float)2.0);
		figs[1] = new Rectangle((float)5.0, (float)4.0);
		figs[2] = new Triangle((float)2.0, (float)4.0);
		
		for (int i=0; i<figs.length; i++) {
			System.out.println("\nEl area del objeto :[ " + i + "] es:" + figs[i].calcArea());
		}
		
		

	}

}
