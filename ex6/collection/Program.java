package ex6.collection;

public class Program {
	public static void main(String[] args) {
		ObjectList list = new ObjectList();
		list.add(2);
		list.add("hello");
		list.add("no");
		list.add("yes");
		if(list.get(1) instanceof String) {
			Object obj = list.get(19);
			System.out.println(obj);
		}
		
//		GList<int?>  Object로 형변환될수 있는 것만 Type이 될 수 있다.
		GList<Integer> students = new GList<>();
		students.add(3);
		//students.add("hello");
		
		GList<String> names = new GList<>();
		names.add("홍길동");
		names.get(0).length();
	}
}
