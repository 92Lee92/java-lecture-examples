package ex5.exception;

public class 천을넘은예외 extends RuntimeException {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "덧셈 결과가 1000을 넘었습니다.";
	}
}
