package randomaccessfile;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

//RandomAccessFile java提供的对文件内容的访问。既可以读文件，也可以写文件
//					支持随机访问文件，可以访问文件的任意位置

//(1)java 文件的模型
	//在硬盘上的文件是byte byte存储的，是数据的集合
/*
 *(2)打开文件
 *有两种模式“rw”（读写） “r”（只读）
 *RandomAccessFile raf=new RandomAccessFile（file，"rw"）;
 *文件指针，打开文件时指针在开头 pointer=0;
 */
/*
 * (3)写方法
 * raf.write(int)-->只写一个字节（后8位）
 * 同时指针指向下一个位置，准备再次写入
 * （4）读方法
 * int b =raf.read()-->读一个字节
 * （5）
 * 文件读写完成以后一定要关闭（Oracle官方说明）
 * 
 */
public class accessFile {
	public static void main(String[] args) throws Exception {
		File demo=new File("D:\\java");
		if(!demo.exists()){
			demo.mkdir();
		}
		File file=new File(demo,"raf.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		//指针的位置
		System.out.println(raf.getFilePointer());
		raf.write('A');//只写了一个字节
		System.out.println(raf.getFilePointer());
//		int i=0x7ffffff;
//		//用writer方法每次只能写一个字节，如果要把i写进去就得写4次
//		writeInt()是对writer进行了封装、
//		raf.writeInt(i); 
		String s="中";
		byte[] gbk=s.getBytes("utf-8");
		raf.write(gbk);
		System.out.print(raf.length());
		
		//读文件，必须把指针移到头部
		raf.seek(0);
		//一次性读取，把文件中的内容都读到字节数组中
		byte[] buff=new byte[(int)raf.length()];
		
		raf.read(buff);
		System.out.print(Arrays.toString(buff));
		String s1=new String(buff);
		System.out.println(s1);
		raf.close();
	}
}
