package sv.edu.ufg.maestria.tje0.ejemplos.inheritence;

public class Rectangle extends RegularShapes {
	private float base;
	private float altura;
	
	public Rectangle(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcArea() {
		
		return (float)(base * altura);
	}

}
