package ex7.abst;

public class Rect extends Shape  {
	private int w;
	private int h;
	
	@Override
	public void drawSpecific() {
		System.out.println("Rect");
	}
//	public void draw() {
//		System.out.println("Rect");
//		System.out.println("그린다");
//	}
//	 
//	public void moveTo(int x, int y) {
//		this.x = x;
//		this.y = y;
//		System.out.printf("(%d,%d)로 이동\n", x,y);
//	}
}
