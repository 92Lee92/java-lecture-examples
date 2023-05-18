package ex8.inter;

public class Program {

	public static void main(String[] args) {
//		Saver saver = new FileSaver();

		DataManager manager = new DataManager();
//		manager.setSaver(new Saver() {
//			@Override
//			public void save(Object[] datas, int index) {
//				System.out.println("파일 저장");
//			}
//		});
		manager.setSaver((Object[] datas, int size)->{
			System.out.println("파일 저장");
		});
		// lambda expression을 이용한 메서드 구현
		
		manager.setLoader(()->{
			System.out.println("파일 로드");
		});
		manager.input();
		manager.print();
		manager.save();
		manager.load();
		manager.sort();
		manager.print();
	}

}
