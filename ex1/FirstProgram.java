package ex1;

class FirstProgram {

	public static void main(String[] args) {

		byte kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = (byte)500;
		kor2 = 70;
		kor3 = 80;
		System.out.println(kor1);

		total = kor1 + kor2 + kor3;
		avg = total / 3;

		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);
		
		int kor4 = 30;
		byte kor5 = 50;
		//kor5 = kor4;
		kor5 = (byte)kor4;
		float x = (float)3.6;
		x = 4.5f;
		
		System.out.write(50);
		System.out.write(65);
		System.out.write(66);
		System.out.write(57);
		System.out.flush();
		
		System.out.write(10);
		System.out.write(65);
		System.out.write(112);
		System.out.write(112);
		System.out.write(108);
		System.out.write(101);
		System.out.write(10);
		
		System.out.flush();
		
		System.out.write('3');
		System.out.flush();
		System.out.write(10);
		
		int code = '3';
		int code1 = code + 1;
		System.out.write(code);
		System.out.write(code1);
		System.out.flush();
		
		
		
		
	}
}