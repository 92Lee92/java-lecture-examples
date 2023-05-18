package etc2;

import java.util.Scanner;

public class SumEven100 {

	public static void main(String[] args) {
		int sum = 0;
		while (sum <=100) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 > ");
		int newInput = scanner.nextInt();
		if (newInput %2 == 0 )
			sum += newInput;
		System.out.println("지금까지 입력한 수 중 짝수의 총 합은 " + sum + " 입니다.");
		}
		System.out.println("종료!");
	}

}
