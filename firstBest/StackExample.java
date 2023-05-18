package firstBest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StackExample {
	public static void main(String[] args) throws IOException {
		String fileName = "res/data.txt";
		FileInputStream fis = new FileInputStream(fileName);
		Scanner scan = new Scanner(fis);
		String line = scan.nextLine();
	//String.length(); //	
		String[] tokens = line.split(" ");
		int size = tokens.length;
		int[] numbers = new int[size];
		for(int i = 0 ; i<size; i++)
			numbers[i] = Integer.parseInt(tokens[i]);
		
		scan.close();
		fis.close();
	}
}
