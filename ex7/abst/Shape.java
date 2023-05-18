package ex7.abst;

public abstract class Shape {
	private int x;
	private int y;

	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.printf("(%d,%d)로 이동\n", x, y);
	}

	public void draw() {
//	System.out.println("Rect");
		// 이건 네(자식)가 책임져
		drawSpecific();
		System.out.println("그린다");
	}

	protected abstract void drawSpecific();
//	{
//		// 아무 할 일이 없다...
//	}
}
