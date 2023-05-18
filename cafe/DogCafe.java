package cafe;

public class DogCafe implements AnimalCafe{

	@Override
	public void open() {
		System.out.println("독까페를 열었다.");
	}

	@Override
	public void close() {
		System.out.println();
	}
	
}
