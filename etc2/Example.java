package etc2;

public class Example {
	public static void main(String[] args) {

		{
			for (int j = 0; j < 11; j++) {
				for (int i = 0; i < 11; i++)
					if (i == j)
						System.out.print("☆");
					else
						System.out.print("　");
				System.out.print("|");
				System.out.println();
			}
			for (int i = 0 ; i<11; i++) {
				System.out.print("￣");
			}
		}
		System.out.println();
		
//		for(int i=0; i<11; i++) {
//			for(int j=0; j<11; j++) 
//			if(i == j) 
//				System.out.print("☆");
//			else
//				System.out.print(" "); 
//			for(int j=0; j<12; j++)
//				if (j == 10) 
//					System.out.print("⎮");
////			System.out.print("⎮");
//				
//		 System.out.println(""); 
//		}
//			for(int i=0; i<11; i++)
//				if(i == 10) 
//					System.out.print("⏌");
//				else
//				System.out.print("_");
		
		
		System.out.println();
		{
			int i = 0;
			while (i < 20) {
				if (i == 2)
					System.out.print("a");
				if (i == 3)
					System.out.print("a");
				else {
					System.out.print("b");
				}
				if (i == 4)
					System.out.print("a");
				else if (i == 6)
					System.out.print("c");
				if (i == 5)
					System.out.print("a");
				else if (i == 6)
					System.out.print("c");
				else
					System.out.print("b");

				i++;
			}
		}
		System.out.println();
//		x = 1;
//		while (x < 19) {
//
//			if (x % 6 != 0)
//				System.out.print("0");
//			else
//				x++;
//		}

		int x = 0;
		while (x < 15) {
			System.out.print("0");
			if (x == 4 || x == 9 || x == 14)
				System.out.print("*");
			x++;
		}
		System.out.println();

		for (int i = 0; i < 15; i++) {
			System.out.print("0");
			if (i == 4 || i == 9 || i == 14)
				System.out.print("*");
		}
		System.out.println();

		int i = 0;
		for (; i < 3;) {
			System.out.println("hello");
			i++;
		}
	}
}
