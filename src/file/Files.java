package file;

import java.io.File;
import java.io.IOException;

public class Files {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\java");
		//设置分隔符
		//File file1=new File("e:"+File.separator);
		
		System.out.print(file.exists());
		if(!file.exists()){
			file.mkdir();
		}else{
			file.delete();
		}
		//是否是一个目录   如果是目录返回true，如果不是目录or目录不存在返回的是false
		System.out.print(file.isDirectory());
		//是否是一个文件
		System.out.print(file.isFile());
		
		//File file2=new File("D:\\java\\01.txt");
		File file2=new File("D:\\java","01.txt");
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			file2.delete();
		}
		//常用的File对象的API
		System.out.println(file); //file.toString()的内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file2.getName());
		System.out.println(file2);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
	}
}
