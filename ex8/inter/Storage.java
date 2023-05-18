package ex8.inter;

public interface Storage extends Saver,Loader{
	static int x = 10;
	
	default void print() {
		System.out.println("공통메소드 interface default 메소드");
	}
	static int getX() {
		return x;
	}
}
