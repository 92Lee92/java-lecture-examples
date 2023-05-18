package firstBest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class GP1 {
	public static void main(String[] args) throws FileNotFoundException {
		int size = 15;
		int[] nums = new int[size];
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner fsc = new Scanner(fis);
			for( int i = 0 ; i<size; i++)
				nums[i] = fsc.nextInt();
		}
		{
			Random random = new Random();
			for (int i = 0 ;i<50 ;i++) {
				int a = random.nextInt(size);
				int b = random.nextInt(size);
				
				int temp = nums[a];
				nums[a] = nums[b];
				nums[b] = temp;
			}
		}
		
		{
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream ps = new PrintStream(fos);
			
			for (int i = 0 ; i<size; i++)
				ps.printf("%d ", nums[i]);
		}
	}
}
