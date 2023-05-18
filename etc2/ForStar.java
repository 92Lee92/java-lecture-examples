package etc2;

public class ForStar {

	public static void main(String[] args) {
//		String star1 = "";
//		for (int i = 1; i < 5; i++) {
//			star1 += "*";
//			System.out.println(star1);
//		}
		
//		*
//		**
//		***
//		****
////		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
					System.out.println();
		}

//		    * 
//		   **
//		  ***
//		 ****
		
		
		
		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= 4; j++)
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			System.out.println();
		}
		
		
		
		
		
		
		
//		for (int i = 0 ; i<7; i=i+2) {
//			for (int k = 6; k >= 0; k=k-2)
//				if (i < k) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			System.out.println();
//		}
		
		
//		****
//		***
//		**
//		*
//		for (int i = 0 ; i<4 ; i++) {
//			for (int j = 4; j>i ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		   *   
//		  ***  
//		 *****
//		******* 
		
		for (int i = 0 ; i<11; i=i+2) {
			for (int k = 10; k >= 0; k=k-2)
				if (i < k) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			for (int j = 0; j<i; j=j+2) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
