package ex6.collection;

public class ObjectList {
	private Object[] store;
	private int max;
	private int index;

	
	public ObjectList() {
		max = 3;
		store = new Object[max];
		index = 0;
	}
	
	public void add(Object value) {
		System.out.println("store 길이: " + store.length);
		System.out.println("index: " + index );
		if(index == max) {
			//공간을 늘리는 코드
			System.out.println("공간 늘린다.");
			max += max;
			Object[] temp = new Object[max];
			for (int i = 0; i < store.length; i++) {
				temp[i] = store[i];
			}
			store = temp;
			System.out.println("공간 늘린 store 길이: " + store.length);
		}
		
		store[index] = value;
		index++;
	}

	public Object get(int i) {
		Object obj=null;
		if(i<=index)
			obj = store[i];
		else {
			System.out.println("해당하는 인덱스가 참조하고 있는 Object가 없습니다.");
		}
		return obj;
	}
}
