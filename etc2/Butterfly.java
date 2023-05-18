package etc2;

public class Butterfly {

	public static void main(String[] args) {

		for (int j = 0; j < 11; j++) {
			if (j == 0) {
				for (int i = 0; i < 11; i++) {
					if (i == 0)
						System.out.print("┌");
					else if (i < 10)
						System.out.print("─");
					else
						System.out.println("┐");
				}
			} else if (j < 10) {
				for (int i = 0; i < 11; i++)
					if (i == 0)
						System.out.print("│");
					else if (i < 10)
//						if ((i > j - 1) || (i < j + 1))
//						if (!(i < j))
//						if (!(j > -i + 10))
//						if (((j > i - 1) && (j > -i + 9)) || (!(i < j)) && !(j > -i + 10))
//						if (!((j > i) && (j > -i + 10) || (!(i < j + 1)) && !(j + 1 > -i + 10)))
						if ( (j<=-i+10) && (j>=i)|| (j<=i)&&(j>=-i+10))
//						if (j > -i + 9)
							System.out.print("*");
						else
							System.out.print(" ");
					else
						System.out.println("│");

			} else
				for (int i = 0; i < 11; i++)
					if (i == 0)
						System.out.print("└");
					else if (i < 10)
						System.out.print("─");
					else
						System.out.println("┘");

		}

	}

}
