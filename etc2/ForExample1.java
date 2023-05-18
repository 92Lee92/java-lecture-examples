package etc2;

import java.util.Iterator;
import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		if (5 < input && input < 10)
//			System.out.println(input);
//		if (input%2 == 0 || input%3 ==0)
//			System.out.println(input);
		
		int x = 1; int y = 1;
		boolean isOdd = (x+y)%2==1 ? true:false;
		System.out.println(isOdd);
		
		for ( int i = 1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int sum = 0;
		for ( int i = 1 ; i<=10; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
		for (int i = 1; i <=10; i++) {
			if( i %2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 10; i >=1; i--) {
			if( i %2 == 1)
				System.out.print(i + " ");
		}
		System.out.println();

	}
}
