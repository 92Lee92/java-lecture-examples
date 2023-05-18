package etc2;

public class Pyramid {
	public static void main(String[] args) {
		for (int i = 0 ; i<7; i++) {
			for (int k = 0; k < 7; k++)
				if ((i >= k)&&(k+i>=6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			System.out.println();
		}
	}
}
