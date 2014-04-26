package sv.edu.ufg.maestria.tje0.ejemplos.inheritence;

public class Triangle extends RegularShapes {
	
	private float altura;
	private float base;
	
	@Override
	public float calcArea() {
		
		return (float)((base * altura)/ 2.0);
	}

	public Triangle(float altura, float base) {
		super();
		this.altura = altura;
		this.base = base;
	}



}
