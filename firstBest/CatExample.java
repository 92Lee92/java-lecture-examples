package firstBest;

public class CatExample {
	public static void main(String[] args) {
		Cat[] cats;
		cats = new Cat[3];
		
		cats[0] = new Cat();
		cats[0].age = 1;
		
		cats[2] = new Cat();
		
		Cat cat1 = cats[0];
		Cat cat2 = cats[1];
		Cat cat3 = cats[2];
		
		System.out.println(cat1.age); 	// 1
		System.out.println(cat2.age);	// NullPointerException
//		System.out.println(cat3.age);	// 0 
		
		
	}
}
