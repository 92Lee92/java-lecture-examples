package etc2;

import java.util.Scanner;

public class Cat {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Q1.");
		System.out.println("당신은 길을 걷다 동물 한 마리를 마주쳤습니다. 어떤 동물인가요?");
		System.out.println("1.개 2.고양이 3.소 4.말 5.토끼 6.햄스터 7.양 8.돼지");
		System.out.print("동물 > ");
		String animal = null;
		boolean run = true;
		동물입력:while (run) {
			animal = scanner.nextLine();
			switch (animal) {
			case "1":
				animal = "개";
				break 동물입력;
			case "2":
				animal = "고양이";
				break 동물입력;
			case "3":
				animal = "소";
				break 동물입력;
			case "4":
				animal = "말";
				break 동물입력;
			case "5":
				animal = "토끼";
				break 동물입력;
			case "6":
				animal = "햄스터";
				break 동물입력;
			case "7":
				animal = "양";
				break 동물입력;
			case "8":
				animal = "돼지";
				break 동물입력;
			default: 
				System.out.println("1~8 숫자를 입력해 주세요");
			}
		}
		System.out.println("어떤 색의 " + animal + "인가요?");
		System.out.println("1.검은색 2.갈색 3.흰색 4.회색 ");
		System.out.print("색 > ");
		String color = scanner.nextLine();
		switch (color) {
		case "1":
			color = "검은색";
			break;
		case "2":
			color = "갈색";
			break;
		case "3":
			color = "흰색";
			break;
		case "4":
			color = "회색";
			break;
		}

		System.out.println("Q2.");
		System.out.println("당신은 만난 동물과 함께 어느 장소에 도착했습니다. 어떤 장소인가요?");
		System.out.print("1.들판 2.사막 3.바닷가 4.강가 > ");
		String place = scanner.nextLine();
		switch (place) {
		case "1":
			place = "들판";
			break;
		case "2":
			place = "사막";
			break;
		case "3":
			place = "바닷가";
			break;
		case "4":
			place = "강가";
			break;
		}
		System.out.println("그곳의 날씨는 어떤가요?");
		System.out.print("1.비가 오고 있다 2. 맑은 날이다 3.바람이 많이 분다 4.안개가 꼈다 > ");
		String weather = scanner.nextLine();
		switch (weather) {
		case "1":
			weather = "비가 오는";
			break;
		case "2":
			weather = "맑은";
			break;
		case "3":
			weather = "바람이 부는";
			break;
		case "4":
			weather = "안개가 낀";
			break;
		}

		System.out.println("결과 생성 중...");
		Thread.sleep(1000);
		System.out.println("당신은 " + color + " " + animal + "와(과) 함께 " + weather+ " 날 " + place + "에 가는 상상을 했습니다.");

	}

}
