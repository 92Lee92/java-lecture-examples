package etc1;

import java.io.IOException;
import java.util.Scanner;

public class PrintExample {
	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────────────┐");
		System.out.println("│       \" 성적 입력 \"      │");
		System.out.println("└──────────────────────────┘");
		
		System.out.print("kor1: ");
		kor1 = scan.nextInt();
		
		System.out.print("kor2: ");
		kor2 = scan.nextInt();
		
		System.out.print("kor3: ");
		kor3 = scan.nextInt();
		
//		System.out.print("kor1 kor2 kor3: ");
//		kor1 = scan.nextInt();
//		kor2 = scan.nextInt();
//		kor3 = scan.nextInt();
//		
//		System.out.print("아무 문자나 입력해주세요: ");
//		int code = System.in.read();			//byte형이면 안됨 int를 리턴하기 때문
//		System.out.println("println()으로 출력:" + code);

//		System.out.write(code);
		
//		System.out.flush();

		int total = kor1 + kor2 + kor3;
		float avg = total / 3.0f;
//		float avg = (float)total / 3;
//		float avg = (float)(total / 3);

		System.out.println("┌──────────────────────────┐");
		System.out.println("│       \" 성적 출력 \"      │");
		System.out.println("└──────────────────────────┘");

		 System.out.printf("국어1: %3d\n", kor1);
		System.out.printf("국어2: %3d\n", kor2);
		System.out.printf("국어3: %3d\n", kor3);
		System.out.printf("총점: %3d\n", total);
		System.out.printf("평균: %6.2f\n", avg);

	}
}
