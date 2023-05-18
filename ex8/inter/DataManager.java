package ex8.inter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

public class DataManager {
	private Object[] datas;
	private Saver saver;
	private Loader loader;
	private int index;

	public DataManager() {
		index = 0;
		datas = new Object[10];
	}

	public void setSaver(Saver saver) {
		this.saver = saver;

	}

	public void setLoader(Loader loader) {
		this.loader = loader;
	}

	public void input() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("스페이스로 구분된 값들을 한 줄로 입력하세요.");
			System.out.print(">");
			String line = scan.nextLine();
			String[] tokens = line.split(" ");

			for (int i = 0; i < tokens.length; i++) {
				datas[index++] = tokens[i];
			}
		}

	}

	public void print() {
		// 23,34,21,34 -> csv 형식으로 출력하기
		int size = index;
		for (int i = 0; i < size; i++) {
			System.out.print(datas[i]);
			if (i < size - 1)
				System.out.print(",");
		}
		System.out.println();
	}

	public void save() {
		saver.save(datas, index);

	}

	public void load() {
//		try (FileInputStream fis = new FileInputStream("res/data17.csv"); Scanner scan = new Scanner(fis);) {
//			String line = scan.nextLine();
//			String[] tokens = line.split(" ");
//			int size = tokens.length;
//			for (int i = 0; i < size; i++)
//				datas[i] = tokens[i];
//			index = size;
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// Loader 인터페이스를 정의하시오.
		// 상단에 Injection이 가능하도록 setter를 추가해주세요.
		loader.load();

	}

	public void sort() {
		// TODO Auto-generated method stub

	}

}
