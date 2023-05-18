package ex2.control;

public class Program {

	public static void main(String[] args) {
		int x = 0;

		// x가 5보다 작을 때만 출력하게 해주세요
		while (x < 20) {
			if (x == 2)
				System.out.print("★");

			else if (x == 6)
				System.out.print("○");

			else
				System.out.print("☆");

			x++;
		}
		System.out.println();
		System.out.println("작업 완료");
	}

}
