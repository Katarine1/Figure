package model.entities;

public abstract class Figure {

	private String type;
		
	public Figure() {
	}	

	public Figure(String type) {
		this.type = type;		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	

	public abstract double area();
	
	public abstract double perimeter();	
	
	@Override
	public String toString() {
		return type +"= Area: "+ String.format("%.2f", area()) + ", Perimeter: "+ String.format("%.2f",perimeter());
	}
}
