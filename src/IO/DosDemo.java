package IO;

import java.io.DataOutputStream;

import java.io.FileOutputStream;

public class DosDemo {
	public static void main(String[] args) throws Exception {
		String file="D:\\java\\01.txt";
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file,true));
		dos.writeUTF("国民");
		dos.close();
	}
}
