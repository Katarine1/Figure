package model.entities;

public class Circle extends Figure {

	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(String type, Double radius) {
		super(type);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}	
}
