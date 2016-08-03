package IO;

import java.io.File;

public class IOFileOutputText {
	public static void main(String[] args) {
		try {
			FileOutputDemo.Files(new File("D:\\downloads\\01.txt"), new File("D:\\java\\01.txt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
