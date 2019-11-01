package model.entities;

public class Triangle extends Figure {

	private Double ladoA;
	private Double ladoB;
	private Double width;
	private Double height;
		
	public Triangle() {
		super();
	}
	
	public Triangle(String type, Double ladoA, Double ladoB, Double width, Double height) {
		super(type);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.width = width;
		this.height = height;
	}
	
	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return (width * height) / 2;
	}
	
	@Override
	public double perimeter() {
		return 3 * (ladoA + ladoB + width);
	}	
}
