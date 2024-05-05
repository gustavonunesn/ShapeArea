package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
	try {
		System.out.print("Enter the numbers of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Shape #%d data\n", i);
			System.out.print("Rectangle or Circle (r/c): ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.printf("COLOR (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine());
			
			if(answer == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else if(answer == 'c') {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("SHAPE AREAS:");
		for(Shape s : list) {
			System.out.printf("%.2f\n",s.area());
		}
		sc.close();
		
	}
	catch(RuntimeException e) {
		System.out.println("Error: Start the program again.");
	}
	}
}

