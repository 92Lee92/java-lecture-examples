package ex0227.ex1;

public class ArrayPrint {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 42, 4, 5, 56, 5, 32, 5, 3, 2, 1 };
		// 1. 위의 배열을 모두 출력하는 코드를 작성하시오.
		for (int i = 0; i < nums.length; i++)
			System.out.printf("%d ", nums[i]);

		System.out.println();

		// 2. 위의 배열을 뒤의 숫자부터 모두 출력하는 코드를 작성하시오
		for (int i = 0; i < nums.length; i++)
			System.out.printf("%d ", nums[nums.length - 1 - i]);

		System.out.println();

		// 3. 위의 배열에서 2의 배수에 대한 숫자만 출력하시오.
		for (int i = 0; i < nums.length; i++)
//			if (nums[i] % 2 == 0 && nums[i] != 0)
			for (int n = 0; n < 100; n++)
				if (nums[i] == 2 + (n - 1) * 2)
					System.out.printf("%d ", nums[i]);

		System.out.println();
		// 위의 배열에서 2의 배수 위치의 숫자만 출력하시오
		int size = nums.length / 2 + 1;
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < size; j++)
				if (i == 1 + (j - 1) * 2)
					System.out.printf("%d ", nums[i]);
		System.out.println();

		{
			for (int i = 0, n = 1; i < nums.length; i++)
				if (i == 2 + (n - 1) * 2) {
					System.out.printf("%d ", nums[i]);
					n++;
				}
		}
		System.out.println();

		// 6. 위의 배열에서 2, 4, 8, 16, 32 위치의 값만 출력하시오.
		{
			System.out.println("등비수열 조건식 연습");
			for (int i = 0, n = 1; i < nums.length; i++)
				if (i == 2 * Math.pow(2, n - 1)) {
					System.out.printf("%d ", nums[i]);
					n++;
				}
		}
		System.out.println();
		// 4. 어떤 조건을 만날 때까지 ( 첫 번째 5를 만날 때까지 숫자를 더하시오.)
		{
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != 5)
					sum += nums[i];
				else
					break;
			}
			System.out.println(sum);
		}
		{// 선생님 코드
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5)
					break;
				System.out.printf("%d ", nums[i]);
			}
			System.out.println();

		}

		// 5. 어떤 조건을 만나고나서부터 (첫 번째 5부터 끝까지의 숫자를 더해서 그 결과를 출력하시오)

		{
			int sum = 0;
			int index = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5)
					index = i;
				if (index > -1)
					sum += nums[i];
			}
			System.out.println(sum);

		}
		{ // 2조 코드
			int sum = 0;
			boolean count = false;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5)
					count = true;
				if (count)
					sum += nums[i];
			}
			System.out.println("첫번째 5부터 마지막까지의 숫자의 합 : " + sum);

		}
		{ // 내 코드
			int sum = 0;
			int index = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5) {
					index = i;
					break;
				}
			}
			for (int i = 0; i < nums.length - index; i++) {
				sum += nums[i + index];
			}
			System.out.println(sum);
		}
		{// 선생님 코드
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 5) {
					continue;
				}
				System.out.printf("%d ", nums[i]);
			}
		}
	}
}
