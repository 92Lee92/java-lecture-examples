package ex9.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreadProgram {

//	public static void print() {
//		for(int i=0 ; i<100; i++)
//			System.out.println("sub hello"+i);
//	}
	public static List<Integer> list;
	// static block을 이용한 초기화
	static {
		list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
	}
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// method하나인 인터페이스를 람다표현식으로 구현
//		Thread th = new Thread(()->{
//			//Iterator를 각각 얻어서 index가 중간에 빠지는 것 없이 다 출력할 수 있다.
//			Iterator<Integer> it = list.iterator();
//			while(it.hasNext())
//				System.out.println("sub hello" +it.next());
//		});
//		th.start();
//		//print();
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext())
//			System.out.println("main hello" + it.next());
		
		
		// 매번 할 때마다 iterator를 쓰는 게 거슬림. iterator를 반환만해주면 알아서 쓸게..=> iterable한 객체를 반복해주는 제어구조가 있다.  Iterator를 구현하고 있는 객체에 대해서
		// => foreach
		// Iterable한 객체만을 전용으로 담당하는 제어구조
		Thread th = new Thread(()->{
			for (Integer n : list)
				System.out.println("sub hello" + n);
		});
//		th.start();
		//print();
//		for (Integer n : list)
//			System.out.println("main hello" + n);
		
		// Iterable를 구현한 객체를 만들어서 foreach를 써보기
		Exam exam = new Exam(10,20,30);
		for(int n: exam)	// foreach안에는 iterable한 객체를 넣어야 한다.
			System.out.println(n);
		
		System.out.println("메인 프로세스 종료");
	}

}
