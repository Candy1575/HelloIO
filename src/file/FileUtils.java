package file;

import java.io.File;

//列出File类的一些常用操作比如过滤，遍历等操作
public class FileUtils {
	/**
	 * 列出指定目录下（包括其子目录）的所以文件
	 * 
	 * @param dir
	 * @throws Exception
	 */
	public static void listDirectory(File dir) throws Exception {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}

		// String[] fileName=dir.list(); //返回的而是字符串数组 直接子的名称，不包含子目录下的内容
		// for(String filename:fileName){
		// //打印子目录
		// System.out.println(filename);
		// //打印全部的目录
		// System.out.println(dir+"\\"+filename);
		// }

		// 遍历子目录下的内容
		File[] files = dir.listFiles(); // 返回的是直接子目录（文件）的抽象
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					listDirectory(file);
				} else {
					System.out.println(file);
				}
			}
		}

	}
}
