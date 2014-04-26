package sv.edu.ufg.maestria.tje0.ejemplos.inheritence;

public abstract class RegularShapes {
	float area;
	
	public RegularShapes() { this.area = (float)0.0; }
	
	public abstract float calcArea();
	public void printMsg(String msg) {
		System.out.println(msg);
	}
}
