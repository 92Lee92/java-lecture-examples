package ex7.abst;

public class Program {

	public static void main(String[] args) {
		Rect rect = new Rect();
		Circle circle = new Circle();
		Line line = new Line();
		
		rect.moveTo(4,2);
		
		Shape[] shapes = new Shape[3];
		
		shapes[0] = rect;
		shapes[1] = circle;
		shapes[2] = line;
		
		for(Shape shape : shapes) {
			shape.moveTo(20, 30);
			shape.draw();
		}
	}

}
