package cafe;

public class Program {

	public static void main(String[] args) {
		AnimalCafe cafe = new CatCafe();
		cafe.open();
		cafe = new DogCafe();
		cafe.open();
	}

}
