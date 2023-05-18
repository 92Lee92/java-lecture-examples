package ex2.operator;

public class Program {

	public static void main(String[] args) {
		int size = 23;
		int type = 2;

		// 위의

		byte data = 0;
		// 0000 0000

		data = 23;
		// 00[010111]

		data = (byte) (data << 2);
		// [010111]00

		data = (byte) (data | 2);
		// [010111]00
		// [000000]10
		
		// [010111]10

		System.out.println(data);
		
		size = data >> 2;
//		type = data&3;
		type = data & 0x03;
		// [010111][10]
		//&[000000][11]
		//=[000000][10]
//		type = ~((data<<30)>>30)+1;
		
		
		System.out.printf("size:%d type:%d\n", size, type);

	}

}
