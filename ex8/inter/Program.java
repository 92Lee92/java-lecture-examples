package ex8.inter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Saver saver = new FileSaver();
		System.out.println(Storage.getX());
		DataManager manager = new DataManager();
		manager.setStorage(new Storage() {
			
			@Override
			public int load(Object[] datas) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void save(Object[] datas, int index) {
				// TODO Auto-generated method stub
				
			}
		});
		manager.getStorage().print();
//		manager.setSaver(new Saver() {
//			@Override
//			public void save(Object[] datas, int index) {
//				System.out.println("파일 저장");
//			}
//		});
//		manager.setSaver((Object[] datas, int size)->{
//			System.out.println("파일 저장");
//		});
		// lambda expression을 이용한 메서드 구현
		
		// lambda를 써도 되는데 이런데서 쓰려고 만들어진 것은 아니다.
//		manager.setLoader(()->{
//			System.out.println("파일 로드");
//		});
		
//		manager.setLoader(new Loader() {
//			@Override
//			public int load(Object[] datas) {
//				int result = 0;
//				try (
//					FileInputStream fis = new FileInputStream("res/data17.csv"); 
//					Scanner scan = new Scanner(fis);) {
//					String line = scan.nextLine();
//					String[] tokens = line.split(" ");
//					int size = tokens.length;
//					//tokens 데이터를 datas 배열로 옮기시오.
//					for (int i = 0; i < size; i++)
//						datas[i] = tokens[i];
//					result = size;
//		
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return result;
//			}
//		});
		manager.input();
		manager.print();
		manager.save();
		manager.load();
		manager.sort();
		manager.print();
	}

}
