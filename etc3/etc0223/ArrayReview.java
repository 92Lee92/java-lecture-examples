package etc3.etc0223;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayReview {
	public static void main(String[] args) {
		// ✏️ 각 기본형 타입별 배열을 모두 선언해보세요. int, byte, boolean 등
		{
			int[] intArray;
			byte[] byteArray;
			boolean[] booleanArray;
		}
		// ✏️ int형 배열 numbers를 선언하세요
		// ✏️ int형 배열 numbers는 기본타입인가요? 아님. 참조타입.
		// ✏️ int형 배열 numbers에 크기 10인 배열을 만든 후, 할당하세요
		// ✏️ int형 배열 numbers의 2번째에 숫자 3을 할당하세요
		{
			int[] numbers;
			numbers = new int[10];
			numbers[1] = 3;

		}

		// ✏️ long형 배열 longNumbers에 크기 3인 배열을 만든 후, 할당하세요
		{
			long[] longNumbers = new long[3];
		}
		// ✏️ long형 배열 longNumbers에 크기 3인 배열을 만든 후, index 2번째를 출력해보세요.
		{
			long[] longNumbers = new long[3];
			System.out.println(longNumbers[1]);
		}
		// ✏️ boolean형 배열 isChecked를 선언하세요. isChecked에 true, false, true를 new연산자없이
		// 할당하세요.
		{
			boolean[] isChecked = { true, false, true };
		}
		// ✏️ 크기가 20인 int형 배열 numbers를 선언하세요. numbers의 index 0부터 19까지, for문을 이용해서 0, 1,
		// 2… 19를 할당해주세요
		{
			int[] numbers = new int[20];
			for (int i = 0; i < numbers.length; i++)
				numbers[i] = i;
		}
		// ✏️ 크기가 10인 문자형 배열 chars를 선언하세요. 반복문을 이용하여 chars의 index가 3의 배수일 땐 ‘a’를, 5의
		// 배수일때 ‘b’를 할당하여 출력해보세요.
		{
			char[] chars = new char[10];
			for (int i = 0; i < chars.length; i++) {
				if (i % 3 == 0 && i != 0)
					chars[i] = 'a';
				else if (i % 5 == 0)
					chars[i] = 'b';
			}
			for (int i = 0; i < chars.length; i++) {
				System.out.printf("%s ", chars[i]);
			}
		}
		// ✏️ int형 배열 numbers를 선언하세요. 다음 코드와 형변환을 이용하여 numbers의 각 인덱스에 i+1값을 할당하여
		// 출력해보세요.
		{
			int numbers[]=new int[10] ;
			for (long i = 0; i < 10; i++) {
				numbers[(int)i] = (int)i+1;
			}
		}
		// ✏️Scanner를 통해 다음을 입력받으세요.
		////// 20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 -1
		////// 크기가 15인 int형 배열에, 입력받은 숫자 중 -1을 제외한 모든 숫자를 차례대로 배열에 할당 후 출력해보세요.
		// ✏️ 위의 문제에서, 배열의 5번째 index 값을 출력해보세요.
		// ✏️ 위의 문제에서, 최댓 값을 찾아 출력하는 코드를 출력해보세요
		{
			Scanner scanner = new Scanner(System.in);
			int[] intArr = new int[15];
			for (int i = 0; i < intArr.length; i++) {
				int input = scanner.nextInt();
				if(input !=-1)
				intArr[i] = input;
			}
			for (int i = 0; i < intArr.length; i++) {
				System.out.printf("%d ", intArr[i]);
				
			}
			System.out.println();
			System.out.println(intArr[4]);
			
			int max = -1;
			for (int i = 0; i < intArr.length; i++) {
				if(max<intArr[i])
					max=intArr[i];
			}
			System.out.println(max);
		}
	}
}
