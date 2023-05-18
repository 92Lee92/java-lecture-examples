package ex8.inter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileSaver implements Saver {

	@Override
	public void save(Object[] datas, int size) {
		try (
				FileOutputStream fos = new FileOutputStream("res/data17.csv");
				PrintStream out = new PrintStream(fos);
			){
//			int size = index;
			for (int i = 0; i <size;  i++) {
				out.print(datas[i]);
				if(i<size-1)
					out.print(",");
			}
			out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
