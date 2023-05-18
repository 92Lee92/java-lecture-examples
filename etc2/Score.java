package etc2;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score1=0;
		int score2=0;
		int score3=0;
		성적관리: while (true) {
			System.out.println("┌──────────────────┐");
			System.out.println("│       성적관리      │");
			System.out.println("└──────────────────┘");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.성적 저장");
			System.out.println("4.성적 로드");
			System.out.println("5.종료");
			System.out.print("입력 > ");

			int input = scan.nextInt();
				input:switch (input) {
				case 1:
					System.out.println("┌──────────────────┐");
					System.out.println("│       성적입력      │");
					System.out.println("└──────────────────┘");
					System.out.println("국어 성적을 입력하세요");
					System.out.print("시험 1 > ");
					score1 = scan.nextInt();
					System.out.print("시험 2 > ");
					score2 = scan.nextInt();
					System.out.print("시험 3 > ");
					score3 = scan.nextInt();
					break input ;
					
				case 2:
					System.out.println("┌──────────────────┐");
					System.out.println("│       성적출력      │");
					System.out.println("└──────────────────┘");
					System.out.println("국어");
					System.out.println("1     " + score1 + "점");
					System.out.println("2     " + score2 + "점");
					System.out.println("3     " + score3 + "점");
					break input;
					
				case 3:
					System.out.println("성적 저장");
					break input;
				case 4:
					System.out.println("성적 로드");
					break input;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					System.out.println("안녕~");
					break 성적관리;
			}
		}

	}

}
