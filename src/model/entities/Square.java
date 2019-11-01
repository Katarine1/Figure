package model.entities;

public class Square extends Figure{

	private Double lado;
	
	public Square() {
		super();
	}	

	public Square(String type, Double lado) {
		super(type);
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimeter() {
		return 4 * lado;
	}	
}
