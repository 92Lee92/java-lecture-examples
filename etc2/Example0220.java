package etc2;

import java.util.Scanner;

public class Example0220 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int input = 0;
		int max = -1;
		int index = 0;
		while (input != -1) {
			input = scanner.nextInt();
			count++;
			if (max < input)
				max = input;
			if (input == 10)
				index = count - 1;
		}
		System.out.println(index);
		System.out.println(count);
		System.out.println(max);

	}
}
