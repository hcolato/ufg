package sv.edu.ufg.maestria.tje0.ejemplos.inheritence;

public class Circle extends RegularShapes {
	private float radio;
	@Override
	public float calcArea() {
		
		return (float)(Math.PI *radio * radio);
	}
	
	public Circle(float radio) {
		super();
		this.radio = radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

}
