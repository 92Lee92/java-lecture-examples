package ex5.exception;

public class 음수가되는예외 extends RuntimeException {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "덧셈 결과가 0보다 작습니다.";
	}
}
