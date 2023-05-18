package ex5.exception;

public class Program {

	public static void main(String[] args){
		int result = 0;
		
		result = Calculator.add(3000, 4);
//		try {
//			result = Calculator.add(440, -4288);
//			System.out.println(result);
//		}catch(천을넘은예외 e){
////			e.printStackTrace();
////			System.out.println("합계가 1000을 넘으면 안됩니다.");
//			System.out.println("사용법: add(x,y) 합계가 1000미만인 정수 x와 y를 입력하세요");
//		} catch (음수가되는예외 e) {
//			System.out.println("예기치 않은 오류가 발생하였습니다.");
//		} finally {
//			System.out.println("마무리작업");
//		}
		System.out.println(result);
	}

}
