package etc2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		{
//			if (menu == 1)
//				System.out.println("짜장면 하나요~");
//			else if (menu == 2)
//				System.out.println("짬뽕 하나요~");
//			else if (menu == 3)
//				System.out.println("볶음밥 하나요~");
//			else if (menu == 4)
//				System.out.println("군만두 하나요~");
//			else
//				System.out.println("오늘의 메뉴요~");
//		}

//		switch : 분기문
		boolean run = true;
		여기를벗어날래: while (run) {
			Scanner scan = new Scanner(System.in);
			System.out.print("원하는 메뉴를 입력하세요.");
			int menu = scan.nextInt();

//			if (menu<1 || menu >6)
 			if (!(1<=menu && menu <=6))
			
			switch (menu) {
			case 1:
				System.out.println("짜장면 하나요~");
				break;
			case 2:
				System.out.println("짬뽕 하나요~");
				break;
			case 3:
				System.out.println("볶음밥 하나요~");
				break;
			case 4:
				System.out.println("군만두 하나요~");
				break;
			case 5:
				System.out.println("주문 안하고 나갈게요.");
				break 여기를벗어날래;
			case 6:
				System.out.println("오늘의 메뉴요~");
				break;

			default:
				System.out.println("메뉴는 1~6번만 입력할 수 있습니다.");
			}

		}
		System.out.println("주문이 종료되었습니다.");
	}

}
