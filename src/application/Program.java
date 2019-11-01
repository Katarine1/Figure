package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Figure;
import model.entities.Rectangle;
import model.entities.Square;
import model.entities.Triangle;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Figure figure;
		
		List<Figure> list = new ArrayList<>();
		
		try {
			System.out.print("Enter the amount of Figures: ");
			int n = sc.nextInt();
			
			for(int i = 0 ; i < n ; i++) {
				System.out.println("Data from #"+ (i + 1) +" Figure:");
				System.out.print("Is the Figure Circle, Square, Rectangle or Triangle? (c, s, r, t): ");
				char ch = sc.next().charAt(0);			
				
				if(ch == 'c') {				
					String type = "Circle";
					System.out.println(type);
					System.out.print("Radius : ");
					double radius = sc.nextDouble();
					figure = new Circle(type, radius);
					list.add(figure);
				}
				else if(ch == 's') {
					String type = "Square";
					System.out.println(type);
					System.out.print("Lado: ");
					double lado = sc.nextDouble();
					figure = new Square(type, lado);
					list.add(figure);
				}
				else if(ch == 'r') {
					String type = "Rectangle";
					System.out.println(type);
					System.out.print("Width : ");
					double width = sc.nextDouble();
					System.out.print("Height : ");
					double height = sc.nextDouble();
					figure = new Rectangle(type, height, width);
					list.add(figure);
				}else {
					String type = "Triangle";
					System.out.println(type);
					System.out.print("Lado A : ");
					double ladoA = sc.nextDouble();
					System.out.print("Lado B : ");
					double ladoB = sc.nextDouble();
					System.out.print("Width : ");
					double width = sc.nextDouble();
					System.out.print("Height : ");
					double height = sc.nextDouble();
					figure = new Triangle(type, ladoA, ladoB, width, height);
					list.add(figure);
				}
			}
			
			System.out.println();
			System.out.println("Figures:");
			
			for(Figure figures : list) {
				System.out.println(figures);
			}
		}
		catch(DomainException e) {
			System.out.println("An error has occurred!" + e.getLocalizedMessage());
		}		
		catch (RuntimeException e) {
			System.out.println("Input Error!");
		}
		finally {
			sc.close();
		}		
	}
}
