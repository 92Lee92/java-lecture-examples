package ex3.lec1;

public class LecExample2 {

	public static void main(String[] args) {
		// nums라는 이름의 정수 7개를 담을 수 있는 배열을 생성해주세요.
		int[] nums = { 2, 3, 42, 5, 56, 5, 32, 5, 3, 2, 1 };

		// nums 배열에서 5보다 큰 값들을 출력하시오.

		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 5)
				System.out.println(nums[i]);

		// 배열에서 특정 값을 찾기
		{
			int num = 4;
			for (int i = 0; i < nums.length; i++)
				if (nums[i] == num)
					System.out.println("nums[" + i + "]이 " + num + "입니다.");
		}
		// nums 배열에서 첫 번째 5를 만나면 그 위치의 인덱스 값을 출력하시오.
		{
			int num = 5;
			int index = -1;
			for (int i = 0; i < nums.length; i++)
				if (nums[i] == num) {
					index = i;
					break; // break안하면 마지막 인덱스를 찾게 됨
				}
			System.out.println(index);
			System.out.println("nums의 인덱스 " + index + "에서 첫 번째 " + num + "를 만납니다.");
		}

		// nums 배열의 값들의 총 합을 구해서 (변수화해서) 출력하시오.
		{
			int total = 0;

			for (int i = 0; i < nums.length; i++)
				total += nums[i];

			System.out.printf("total is %d\n", total);
		}

		{ // 이렇게 하는 것보다 위와 같이 하는 것이 좋다. 콘솔과 코드를 분리해야 좋음.
			for (int i = 0; i < nums.length; i++)
				if (nums[i] == 5) {
					System.out.println(i);
					break;
				}
		}

		// nums 배열에서 "뒤에서부터 만나는 첫 번째 5"의 인덱스를 (구하고) 출력하시오.
		{
			int index = -1;
			int maxIndex = nums.length-1;
			for (int i = 0; i < nums.length; i++)
				if (nums[maxIndex- i] == 5) {
					index = maxIndex - i;
					break;
				}
			System.out.printf("index is %d\n", index);
		}
		// nums 배열에서 "첫 번째 5"를 인덱스를 구하고 그 이후의 값을 모두 출력하시오.
		{
			// 인덱스를 구하기
			int index = -1;
			 for (int i = 0 ; i<nums.length; i++) {
				 if (nums[i] ==5) {
					 index = i;
					 break;
				 }
			 }
			// 구현 index 이후부터 출력하기
			 for (int i = index+1 ; i< nums.length; i++)
				 System.out.printf("%d ",nums[i]);
		System.out.println();	 
			 for (int i = 0; i< nums.length-(1+index); i++)		//nums.length-1이 최대 인댁스, index부터 최대 인덱스까지 반복하기 위해 차를 구했다.
				 System.out.printf("%d ", nums[i+(index+1)]);		// index보다 1 큰것부터 nums.length-1까지 출력하기 위해
		}

		// 배열에서 두 곳의 값을 바꾸기

		// 배열에 값을 일괄 변경하기
		// 배열의 값을 집계하기
	}

}
