package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputDemo {
	public static void Files(File file1,File file2) throws Exception{
		if(!file1.isFile()){
			throw new IllegalArgumentException(file1+"不是文件");
		}
		
		
		FileOutputStream fos=new FileOutputStream(file2);
		FileInputStream fis=new FileInputStream(file1);
		int b;
		byte[] bytes=new byte[1024*10];
		while((b=fis.read(bytes,0,bytes.length))!=-1){
			fos.write(bytes,0,bytes.length);
			fos.flush();
			
		}
		fos.close();
		fis.close();
	}
}
