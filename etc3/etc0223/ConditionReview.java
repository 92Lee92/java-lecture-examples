package etc3.etc0223;

import java.util.Scanner;

public class ConditionReview {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		{
			for (int i = 0; i < 30; i++) {
				if (i % 4 == 0)
					System.out.printf("%d ", i);
			}
			System.out.println();
		}
		{
			for (int i = 0; i < 30; i++) {
				if ((i % 2 == 0) && (i % 3 == 0))
					System.out.printf("%d ", i);
			}
			System.out.println();
		}
		{
			for (int i = 0; i < 30; i++) {
				if ((i % 3 == 0) || (i % 7 == 0))
					System.out.printf("%d ", i);
			}
			System.out.println();
		}
		{
			int input = scanner.nextInt();
			if (20 < input && input < 50)
				System.out.println(input);
		}
		{
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("떡볶이");
				break;
			case 2:
				System.out.println("어묵");
				break;
			case 3:
				System.out.println("순대");
				break;
			case 4:
				System.out.println("튀김");
				break;
			case 5:
				System.out.println("핫도그");
				break;
			default:
				System.out.println("유효한 숫자의 범위가 아닙니다.");
			}
			{
				int score = scanner.nextInt();
				if (score >= 90)
					System.out.println('A');
				else if (score >= 80)
					System.out.println('B');
				else if (score >= 70)
					System.out.println('C');
				else if (score >= 60)
					System.out.println('D');
				else
					System.out.println('F');

			}

		}
	}
}
