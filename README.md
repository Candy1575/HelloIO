# HelloIO
Java io 
/*
	 *  IO流（输入流，输出流）
	 *  字节流 字符流
	 *  1字节流
	 *  1）InputStream，OutputStream
	 *  InputStream抽象了应用程序读取数据的方式
	 *  OutputStream抽象了应用程序写出数据的方式
	 *  2）EOF=End 读到-1就读到结尾
	 *  3）输入流基本方法
	 *  int b=in.read();读取一个字节无符号填充到int低八位，—1是EOF
	 *  in.read(byte[] buf)
	 *  in.read(byte[] buf,int start,int size)
	 *  
	 *  FileOutputStream/FileInputStream
	 * 
	 *  DataOutputSteam/DataOutputStream
	 * 
	 * 
	 *  BufferedInputStreamStream&& BufferedOutputStream
	 *  这俩个流类位IO提供了带缓冲区的操作，一般打开文件进行写入
	 *  或读取操作时，都会加上缓冲，这种流模式提高了IO的性能
	 *  从应用程序中把输入放入文件。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  2字符流 --》》》                                        									
	 *  java的文本（char）是16无符号整数，是字符的unicode编码（双字节）编码
	 *  文件是byte byte byte。。。的数据序列
	 *  文本文件是文本（char）序列按照某种编码方案（utf-8。。）序列化为byte的存储
	 *  字符的处理，一次处理一个字符
	 *  字符的底层任然是基本的字节序列     								  			文本 编码问题
	 *  inputStreamReader完成byte流解析为char流，按照编码解析
	 *  OutputStreamWriter完成char流解析为byte流，按照编码解析
	 * 
	 * 
	 * 
	 * 
	 *  FileReader  FileWriter 											文件
	 * 
	 * 
	 * 
	 *  BufferedReader-----》readline 一次读一行
	 *  BufferedWriter/PrintWriter       写一行                       newLine 换行
	 * 
	 * 
	 */
