package ex9.collection;

import java.util.Iterator;

public class Exam implements Iterable<Integer>{
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Exam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	//ExamItertor를 inner class로 선언
	class ExamIterator implements Iterator<Integer>{
		private int index;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
		if(index == 3)
			return false;
		return true;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			switch(index++) {
			case 0 :
				return Exam.this.kor;	//inner class에서 outer의 this를 사용할 수 있다.
			case 1:
				return Exam.this.eng;
			case 2:
				return Exam.this.math;
			}
			return Exam.this.kor;
		}
		
	}
	
	// 익명클래스로 구현하는 것보다 innerclass를 만들어서 구현하는 것이 더 좋다.
	@Override
	public Iterator<Integer> iterator() {
		return new ExamIterator();
//		return this.new ExamIterator();  // this.가 생략되었다.
	}
	
	
}
