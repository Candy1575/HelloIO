package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOUtil {
	/**
	 * 读取指定文件内容，按照16进制输出到控制台
	 * 
	 * @param fileName
	 * @throws Exception
	 */
	public static void printHex(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		int b;
		int i = 1;
		while ((b = fis.read()) != -1) {
			if (b <= 0xf) {
				// 单位数面前补0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + " ");
			if (i++ % 10 == 0) {
				System.out.println("");
			}
		}
		fis.close();
	}

	public static void printHexByByteArray(String fileName) throws Exception {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20 * 1024];
		// 从in中批量读取字节，从第0个位置开始放，最多放buf.length个 返回的是读到的字节的个数放到buf中。
		// int bytes=in.read(buf,0,buf.length);
		// int j=1;
		// for(int i=0;i<bytes;i++){
		// System.out.println(Integer.toHexString(buf[i]& 0xff)+"");
		// if(j++%10==0){
		// System.out.print("");
		// }
		// }

		int bytes = 0;
		while ((bytes = in.read(buf, 0, buf.length)) != -1) {
			for (int i = 0; i < bytes; i++) {
				System.out.println(Integer.toHexString(buf[i] & 0xff) + "");
			}
		}
		in.close();
	}
	
	/**
	 * 
	 * @param srcFile
	 * @param destFile
	 * @throws Exception
	 */
	public static void copyFileByBuffer(File srcFile,File destFile) throws Exception{
		BufferedInputStream buffis=new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream buffos=new BufferedOutputStream(new FileOutputStream(destFile));
	
		int b;
		while((b=buffis.read())!=-1){
			buffos.write(b);
			buffos.flush();//刷新缓冲区
		}
		buffis.close();
		buffos.close();
		
		
	}
	
	
	
	
	
	
	
	
	
}
