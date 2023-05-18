package etc2;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		int j = 1;
		while (j <= 100) {
			if ( j % 3 ==0) {
			System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		
		int k = 1;
		int sum = 0;
		while (k <=30) {
			if (k %2 ==0) {
				sum+=k;
			}
			k++;
		}
		System.out.println(sum);
		
		int l = 1;
		sum = 0;
		do {
			if(l%2 ==0)
				sum+=l;
			l++;
		}while (l<=31);
		System.out.println(sum);
	}
}
