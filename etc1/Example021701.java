package etc1;

import java.util.Scanner;

public class Example021701 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" < 뉴렉 카페 신메뉴 개발 > ");
		System.out.println("어떤 원두를 사용할까?");
		System.out.println("1. 가성비 원두 2. 제주도 원두 3. 프리미엄 뉴렉 원두");
		int beanChoice = scanner.nextInt();
		System.out.println("그 원두의 가격은 얼마야 ? 숫자만 입력");
		int beanPrice = scanner.nextInt();
		System.out.println("대략");
		System.out.println(beanChoice * beanPrice);
		System.out.println("원 이군!");

		int int1, int2;
		int1 = 3;
		int2 = 4;
		int result1 = int1 + int2;
		int result2 = int1 - int2;
		int result3 = int1 * int2;
		int result4 = int1 / int2;
		int result5 = int1 % int2;

		boolean result6 = (int1 == int2);
		boolean result7 = (int1 + int2) == 5;
		boolean result8 = (int1 == int2) && (int1 - int2 > 0);
		boolean result9 = (int1 % int2 == 3) || (int1 * int2 == 12);
		int x = 7;
		boolean result10 = 3 < x && x <= 5;
		boolean result11 = x % 3 == 2 || x % 7 == 0;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		System.out.println(result10);
		System.out.println(result11);

		for (int i = 0; i <= 100; i++) {
			if ((48 + i) / (12 + i) == 3 && (48 + i) % (12 + i) == 0)
				System.out.println(i + "년 후");
		}

	}

}
