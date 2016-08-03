package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisDemo {
	public static void main(String[] args) throws Exception {
		String file="D:\\java\\01.txt";
		DataInputStream dis=new DataInputStream(new FileInputStream(file));
		byte[] bytes=new byte[1024*10];
		String b =dis.readUTF();
		System.out.print(b);
		dis.close();
		
	}
}
