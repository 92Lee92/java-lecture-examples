package ex3.lec1;

public class LecExample1 {

	public static void main(String[] args) {
		// nums라는 이름의 정수 6개를 담을 수 있는 배열을 생성해주세요.
		int[] nums = new int[6];

		// nums배열에 3번째 공간에 20을 대입하는 코드를 작성해주세요.
		nums[2] = 20;

		// nums배열에서 3번째 공간의 값을 2번째 공간에 대입하는 코드를 작성하시오.
		nums[1] = nums[2];

		// nums배열에서 3번째 공간의 값보다 4번째 공간의 값이 더 크면 1번째 공간에 1을 대입하는 코드를 작성하시오.
		if (nums[2] < nums[3])
			nums[0] = 1;

		// nums배열의 1번째 공간부터 4번째 공간까지 값을 1로 채우는 코드를 작성하시오.
		for (int i = 0; i < 4; i++)
			nums[i] = 1;

		// nums배열의 2번째 공간부터 4번째 공간까지 값을 2로 채우는 코드를 작성하시오.
		for (int i = 0; i < 3; i++) // 반복 횟수를 한 번에 볼 수 있도록 작성
			nums[i + 1] = 2;

// 		for (int i = 1 ; i<4 ; i++)
//			nums[i] = 1;
		
	
		
		
	}

}
