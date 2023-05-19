package ex9.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		// Generic을 지정하지 않으면 기본타입으로 Object가 된다.
		List list = new ArrayList();
		list.add(3);
		list.add("3");
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		System.out.printf("list length:%d\n", list.size());
		System.out.println(list.toString());

		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(5);
		list1.add(21);
		list1.add(53);
		list1.add(365);
		
		//List는 index를 식별자로 가짐. 같은 값을 넣어도 index로 식별 가능
		System.out.printf("list1 length:%d\n", list1.size());
		System.out.println(list1.toString());
		System.out.printf("list1.get(0) :%d\n", list1.get(0));
		Iterator<Integer> listIt = list1.iterator();
		System.out.println(listIt.next());
		System.out.println(listIt.next());
		System.out.println(listIt.next());
		System.out.println(listIt.next());
		System.out.println(listIt.next());
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(3);
		set.add(4);
		// Set은 값 자체를 식별자로 가짐. 중복된 값이 들어가지 않는다.
		System.out.printf("set length:%d\n", set.size());
		System.out.println(set.toString());
		// set은 꺼내는 게 불가능하다. 식별자가 없기 때문
		System.out.println("Set은 식별자가 없어서 값을 지정해서 꺼내지 못함.");
		System.out.println(set.iterator().next());
		System.out.println(set.iterator().next());
		
		// 일시적으로 사용하는 데이터를 클래스로 만들지 않고 임시적으로 Map에 키와 값 쌍으로 저장해서 사용
		Map<String, Object> notice = new HashMap<>();
		notice.put("id",1);
		notice.put("title", "collection이란 무엇인가");
		notice.put("hit", 12);
		System.out.printf("notice length:%d\n", notice.size());
		System.out.println(notice.toString());
		System.out.printf("title 값을 꺼내기 notice.get(\"title\") %s\n", notice.get("title"));
		System.out.printf("hit 값을 꺼내기 notice.get(\"hit\") %d\n", notice.get("hit"));
		System.out.println(notice.values().iterator().next());
		System.out.println(notice.values().iterator().next());
		System.out.println(notice.values().iterator().next());
	
		
	}
}
