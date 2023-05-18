package etc3.etc0224;

import java.util.Iterator;

public class ArrayReview {

	public static void main(String[] args) {
		// 🔥0224🔥
//		✏️ int형 배열 변수 arrays를 선언해주세요
		{
			int[] arrays;
		}
//		✏️ int형 배열 변수 arrays에 크기가 10인 배열을 만들어주세요
		{
			int[] arrays = new int[10];
		}
//		✏️ arrays의 모든 값들을 출력해보세요. 왜 그 값이 나오는지도 설명해보세요.
		{ // 0 0 0 0 0 0 0 0 0 0 출력됨. 배열에 값을 넣지 않으면 int의 기본값인 0으로 초기화됨.
			int[] arrays = new int[10];
			for (int i = 0; i < arrays.length; i++) {
				System.out.printf("%d ", arrays[i]);
			}
		}
		System.out.println();
//		✏️ arrays.length를 출력해보세요. 
		{
			int[] arrays = new int[10];
			System.out.println(arrays.length);
		}
//		✏️ arrays의 마지막 값을 arrays.length를 이용해 출력해보세요. 
		{
			int[] arrays = new int[10];
			System.out.println(arrays[arrays.length - 1]);
		}
//		✏️ 배열의 length와 index는 어떤 차이가 있는지 생각해보세요.
		{
			// 배열의 length는 배열의 크기를 말하고 배열의 index는 배열에 각 공간의 번호로 0부터 시작하고, length-1이 최댓값이다.
		}
//		✏️ for문을 이용하여 arrays에 정수 0부터 9까지 채운 후, 출력해보세요.
		{
			int[] arrays = new int[10];
			for (int i = 0; i < arrays.length; i++) {
				arrays[i] = i;
				System.out.printf("%d ", arrays[i]);
			}
//		✏️ 위의 arrays의 값 9부터 0까지 거꾸로 출력해보세요.
			System.out.println();
			for (int j = 0; j < arrays.length; j++) {
				System.out.printf("%d ", arrays[arrays.length - 1 - j]);
			}
			System.out.println();
//		✏️ 배열에서 index가 5인 값을 출력해보세요.
			System.out.println(arrays[5]);
//		✏️ 배열에서 값이 6인 index를 찾아 출력해보세요.
			int index = -1;
			for (int i = 0; i < arrays.length; i++) {
				if (arrays[i] == 6)
					index =i;
			}
			System.out.println(index);
//		✏️ 배열에서 값이 3의 배수인 값을 찾아 출력해보세요.
			for (int i = 0; i < arrays.length; i++) {
				if (arrays[i] % 3 == 0 && arrays[i] != 0)
					System.out.printf("%d ", arrays[i]);
			}
			System.out.println();
//		✏️ 배열에서 값이 2의 배수인 경우만 index를 출력해보세요.
			for (int i = 0; i < arrays.length; i++) {
				if (arrays[i] % 2 == 0 && arrays[i] != 0)
					System.out.printf("%d ", i);
			}
			System.out.println();

//		✏️ index가 2의 배수인 경우 기존 값에 두배를 재할당한 후, 출력해보세요.
			for (int i = 0; i < arrays.length; i++) {
				if (i % 2 == 0 && i != 0)
					arrays[i] *= 2;
				System.out.printf("%d ", arrays[i]);
			}
		}
		System.out.println();
//		✏️ char형 배열 변수 cArray를 선언해주세요.
		{
			char[] cArray;
//		✏️ char형 배열 변수 cArray에 크기가 10인 배열을 만들어주세요.
			cArray = new char[10];
//		✏️ for문을 이용하여 cArray에 ‘a’부터 ‘j’까지 채운 후, 출력해보세요. (문자 ‘a’의 아스키 코드값은 97입니다.)
//		a b c d e f g h i j
			for (int i = 0; i < cArray.length; i++) {
				cArray[i] = (char) (97 + i);
				System.out.printf("%s ", cArray[i]);

			}
			System.out.println();
//		✏️ 위 cArrays의 값 ‘a’부터 ‘j’까지 거꾸로 출력해보세요.
			for (int i = 0; i < cArray.length; i++) {
				System.out.printf("%s ", cArray[cArray.length - 1 - i]);
			}
			System.out.println();
//		✏️ 배열에서 index가 0이거나 6일 때 값을 출력해보세요.
			for (int i = 0; i < cArray.length; i++) {
				if (i == 0 || i == 6)
					System.out.printf("%s ", cArray[i]);
			}
			System.out.println();
//		✏️ 배열에서 값이 ‘e’인 index를 찾아 출력해보세요.
			int index = -1;
			for (int i = 0; i < cArray.length; i++) {
				if (cArray[i] == 'e')
					index = i;
			}
			System.out.println(index);
//		✏️ 배열에서 index가 2의 배수인 경우만 값을 출력해보세요.
			for (int i = 0; i < cArray.length; i++) {
				if (i % 2 == 0 && i != 0)
					System.out.printf("%s ", cArray[i]);
			}
		}
		System.out.println();
//		✏️크기가 10인 정수형 배열 arrays의 index가 0, 2, 4, 6, 8일때 값 1을 채운 후, 배열의 모든 값을 출력해주세요.
		{
			int[] arrays = new int[10];
			for (int i = 0; i < arrays.length; i++) {
				if (i % 2 == 0)
					arrays[i] = 1;
			}
			for (int i = 0; i < arrays.length; i++) {
				System.out.printf("%d ", arrays[i]);
			}
		}
		System.out.println();
//		✏️다음 배열의 크기를 출력해보세요
		{
			int[] nums = { 1, 32, 56, 22, 33, 5, 82, 65, 99 };
			System.out.println(nums.length);
		}
//		✏️다음 배열에서 값이 12인 index는 몇인가요?
		{
			int[] nums = { 3, 6, 9, 12, 15 };
			int index = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 12)
					index = i;
			}
			System.out.println(index);
		}
//		✏️ 닭장 chickens에 닭들이 스트레스 받지않게 닭들을 번갈아가며 넣어주세요.
		{
			char[] chickens = { '없', '없', '없', '없', '없' };
//		출력 결과 : 닭 없 닭 없 닭
//		순한 첫번째칸과 마지막 칸의 닭은, chickens[?]를 이용해서 넣어주세요.
//		닭장 세번째 칸의 닭은 성격이 까다로워서 for문과 index를 이용해서 넣어주세요.
			chickens[0] = '닭';
			chickens[chickens.length - 1] = '닭';
			int index = 2;
			for (int i = 0; i < chickens.length; i++) {
				if (i == index)
					chickens[i] = '닭';
			}
			for (int i = 0; i < chickens.length; i++) {
				System.out.printf("%s ", chickens[i]);
			}
		}
		System.out.println();
		{
			int[] nums = { 1, 32, 56, 22, 33, 5, 82, 65, 99, 33, 5, 1, 32 };
//		✏️배열 nums의 값 중, 크기가 50이하인 값과 인덱스를 모두 출력해보세요.
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= 50)
					System.out.printf("값:%d 인덱스는 %d ,", nums[i], i);

			}
			System.out.println();
//		값 : 32, 인덱스는 : 1
//		값 : 22, 인덱스는 : 3…
//		✏️위의 문제를 거꾸로 출력해보세요.
			for (int i = 0; i < nums.length; i++) {
				if (nums[nums.length - 1 - i] <= 50)
					System.out.printf("값:%d 인덱스는 %d ,", nums[nums.length - 1 - i], nums.length - 1 - i);

			}
//		값 : 5, 인덱스는 5
//		값 : 33, 인덱스는 4…
			System.out.println();
//		✏️배열 nums에서 두번째 5의 index를 출력해보세요.
			int index = -1;
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5) {
					index = i;
					count++;
				}
				if (count == 2)
					break;
			}
			System.out.println("두번째 5의 index: "+index);
		}
//		✏️크기가 10인 문자형 배열 chars에 for문, swtich문을 이용하여 다음 369게임 출력 해주세요.
		{
			char[] chars = new char[10];
			for (int i = 0; i < chars.length; i++) {
				if ((i + 1) % 3 == 0)
					chars[i] = '짝';
			}
			for (int i = 0; i < chars.length; i++) {
				switch (chars[i]) {
				case '짝':
					System.out.printf("%s ", '짝');
					break;
//				case '\u0000':
				default:
					System.out.printf("%d ", i + 1);
				}
			}

//		출력은 : 1 2 짝 4 5 짝 7 8 짝 10
		}

	}

}
