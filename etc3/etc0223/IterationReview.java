package etc3.etc0223;

public class IterationReview {
	public static void main(String[] args) {
		// ✏️ for문과 while문을 사용하는 기준을 설명해보세요
		////// for문은 실행 횟수가 정해져 있을 때 사용한다.
		////// while문은 조건에 안맞을때까지 실행

		// for문의 각 ?를 설명해보세요 for(?;?;?)
		////// 첫 번째 ? : 초깃값 두번째 ?: 조건식 세번째?: 증감문

		// ✏️ for문과 int i를 이용해서 10번 반복되는 for문을 작성해보세요. { } 안에는 비워주세요.
		{
			for (int i = 0; i < 10; i++) {
			}
		}
		// ✏️ for문을 이용해서, 콘솔에 문자열 “Hello newlecture!”를 3번 출력해보세요
		{
			for (int i = 0; i < 3; i++) {
				System.out.println("Hello newlecture!");
			}
		}
		// ✏️ num이 짝수일때만 콘솔에 문자열 “Hello newlecture!”를 출력해보세요.

		{
			int num = 0;
			for (int i = 0; i < 10; i++) {
				num++;
				if (num % 2 == 0)
					System.out.println("Hello newlecture");
			}
		}
		// ✏️ for문을 이용해서, 콘솔에 정수 1부터 10까지 출력해보세요.

		{
			for (int i = 0; i < 10; i++)
				System.out.print(i + 1 + " ");
		}
		System.out.println();
		// ✏️ for문을 이용해서, 콘솔에 정수 10부터 1까지 출력해보세요.
		{
			for (int num = 10; num > 0; num--)
				System.out.print(num + " ");
		}
		System.out.println();
		// ✏️ for문을 이용해서, 콘솔에 정수 1부터 10까지 짝수만 출력해보세요.
		{
			for (int i = 0; i < 10; i++) {
				if ((i + 1) % 2 == 0) {
					System.out.print(i + 1 + " ");
				}
			}
		}
		System.out.println();

		// ✏️ for문을 이용해서, 콘솔에 정수 1부터 10까지 홀수만 더한 값을 출력해보세요.
		{
			int oddSum = 0;
			for (int i = 0; i < 10; i++) {
				if ((i + 1) % 2 == 1)
					oddSum += (i + 1);
			}
			System.out.println(oddSum);
		}

		// ✏️ while문의 ?를 설명해보세요 while( ? ) { }
		////// while문이 실행되는 조건식. true일 때 내부 코드가 실행된다.

		// ✏️ number가 100이 되면, while문을 종료하는 코드를 작성하세요.
		{
			int number = 0;
			while (true) {
				number++;
				System.out.printf("%d ", number);
				if (number == 100)
					break;
			}
		}
		System.out.println();
		// ✏️ while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요. number의 값이
		// 100이 되면 while문을 빠져나와주세요.
		{
			int number = 0;
			while (true) {
				number++;
				if (number % 2 == 0)
					System.out.print("+ ");
				else
					System.out.print("- ");
				if (number == 100)
					break;
			}
		}
		// ✏️ while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요. 이때, x축의 문자가
		// 10개가 되면, 줄바꿈을 해보세요
		{
			int number = 0;
			while (true) {
				number++;
				if (number % 2 == 0)
					System.out.print("+ ");
				else
					System.out.print("- ");
				if (number % 10 == 0)
					System.out.println();
				if (number == 100)
					break;
			}
		}
		// ✏️for문을 이용하여 다음처럼 구구단 표를 출력해보세요.
		{
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 9; j++)
					System.out.printf("%d * %d = %d\n", i + 2, j + 1, (i + 2) * (j + 1));
		}
		System.out.println();
		// ✏️for문을 이용하여 구구단 표를 출력해보세요. 구구단 결과 값이 홀수일 때만 출력해보세요.
		{
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 9; j++)
					if ((i + 2) * (j + 1) % 2 == 1)
						System.out.printf("%d * %d = %d\n", i + 2, j + 1, (i + 2) * (j + 1));
		}
		System.out.println();
		// ✏️ 다음 코드를 이용해서, randomNum이 60이상이면 while문을 빠져나가는 코드를 작성해주세요. while문을 빠져나갈 때 까지 randomNum의 값을 출력해주세요.
		//int randomNum = (int) (Math.random() * 100) + 1
		{
			while(true) {
				int randomNum = (int)(Math.random()*100)+1;
				System.out.printf("%d ", randomNum);
				if(randomNum>=60)
					break;
			}
		}
	}
}
