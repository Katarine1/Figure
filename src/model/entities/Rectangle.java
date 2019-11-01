package model.entities;

public class Rectangle extends Figure {
	
	private Double height;
	private Double width;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String type, Double height, Double width) {
		super(type);
		this.height = height;
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return 2 * (width + height);
	}	
}
