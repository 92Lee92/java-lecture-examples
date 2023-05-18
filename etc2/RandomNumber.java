package etc2;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 10) + 1;
		System.out.println("Java: 제가 생각한 랜덤한 숫자를 맞춰보세요! 제가 생각한 숫자는 1부터 10 사이 입니다.");
		while(true) {
			System.out.println("입력 > ");
			int input = scanner.nextInt(); 
			if ( randomNum > input) {
			System.out.println("Java: 그것보다는 큽니다.");
		}else if ( randomNum < input) {
			System.out.println("Java: 그것보다는 작습니다.");
		}else {
			System.out.println("Java: 정답입니다.");
			break;
		}
		}
		System.out.println("Java: 게임 종료");
	}

}
